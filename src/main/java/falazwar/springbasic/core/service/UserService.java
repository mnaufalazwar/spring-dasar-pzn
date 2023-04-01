package falazwar.springbasic.core.service;

import falazwar.springbasic.core.data.User;
import falazwar.springbasic.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public boolean login(String username, String password){
    if(isLoginSuccess(username, password)){
      applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
      return true;
    }
    return false;
  }

  private boolean isLoginSuccess(String username, String password) {
    if(username.equalsIgnoreCase(password)){
      return true;
    }
    return false;
  }
}
