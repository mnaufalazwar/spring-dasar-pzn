package falazwar.springbasic.core.listener;

import falazwar.springbasic.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

  @Async // to make event listener execute in async mode
  @EventListener(classes = LoginSuccessEvent.class)
  public void onLoginSuccessEvent(LoginSuccessEvent event){
    log.info("Success annotation login {}", event.getUser().getUsername());
  }

  //sumber :
  //https://www.techgeeknext.com/spring-boot/spring-boot-event-listener-example#:~:text=Boot%20Event%20Listener-,A%20listener%20can%20be%20defined%20in%20two%20ways.,have%20completed%20processing%20the%20event.
