import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize= "2560x1440";
    }

    @Test
    void myfirsttest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alexander");
        $("#lastName").setValue("Ignatenko");
        $("#userEmail").setValue("LainQa63@gmail.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1995");
        $(".react-datepicker__month-select").selectOptionByValue("9");
        $(".react-datepicker__day--010").click();
        $("[for=hobbies-checkbox-3]").click();
        $("#currentAddress").setValue("Samarskaya oblst`");
        $("#state").click();
        $("#state").find(byText("Haryana")).click();
        $("#city").click();
        $("#city").find(byText("Panipat")).click();
        $("#submit").click();

    }
}