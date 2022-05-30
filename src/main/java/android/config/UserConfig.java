package android.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:login-info.properties")
public interface UserConfig extends Config {
    UserConfig CONF = ConfigFactory.create(UserConfig.class);

    @Key("Email")
    String email();
    @Key("Password")
    String password();

}

