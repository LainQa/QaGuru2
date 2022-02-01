package simpleTest.properies;


import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static java.lang.String.format;

@Tag("properties")
public class ownersTest {
    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    @DisplayName("Вывод на экран логина и пароля")
    void readCredentialsTest2() {
        step("Читаем данные из файла", () -> {
            String login = credentials.login();
            String password = credentials.password();
            step("Выводим, что прочитали", () -> {
                System.out.println(login);
                System.out.println(password);
                String message = format("i login as %s with password %s", login, password);
                System.out.println(message);
            });
        });
    }
}


