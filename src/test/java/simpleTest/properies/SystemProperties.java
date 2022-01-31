package simpleTest.properies;

import com.codeborne.selenide.Configuration;
import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemProperties {
    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("properties")
    void someTest1() {
        String login = credentials.login();
        String password = credentials.password();
        Configuration.remote = format("https://%s:%s@%s", login, password, System.getProperty("testUrl"));
        System.out.println(login);
        System.out.println(password);
    }
}
