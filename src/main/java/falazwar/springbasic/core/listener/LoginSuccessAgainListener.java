package falazwar.springbasic.core.listener;

import falazwar.springbasic.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginSuccessAgainListener implements ApplicationListener<LoginSuccessEvent> {
  @Override
  public void onApplicationEvent(LoginSuccessEvent event) {
    log.info("success login again for user {}", event.getUser().getUsername());
  }
}
