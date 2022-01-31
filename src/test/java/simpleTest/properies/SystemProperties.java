package simpleTest.properies;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProperties {
    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("properties")
    void someTest1() {
        String login = credentials.login();
        String password = credentials.password();
        System.out.println(login);
        System.out.println(password);
    }
}
