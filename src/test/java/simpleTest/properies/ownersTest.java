package simpleTest.properies;

import com.codeborne.selenide.Configuration;
import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class ownersTest {
    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("properties")
    void someTest1() {
        String login = credentials.login();
        String password = credentials.password();
        String message = format("i login as %s with password %s", login, password);
        System.out.println(message);

    }
}
