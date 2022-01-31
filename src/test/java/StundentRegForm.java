import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import java.io.File;

public class StundentRegForm extends TestBase {

    @Test
    void testingAutomationForm() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alexander");
        $("#lastName").setValue("Ignatenko");
        $("#userEmail").setValue("LainQa63@gmail.com");
        $(".custom-control-label").click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1995");
        $(".react-datepicker__month-select").selectOptionByValue("9");
        $(".react-datepicker__day--010").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("[for=hobbies-checkbox-3]").click();
        $("#currentAddress").setValue("Samarskaya oblast");
        $("#state").click();
        $("#state").find(byText("Haryana")).click();
        $("#city").click();
        $("#city").find(byText("Panipat")).click();
        $(".form-control-file").uploadFile(new File("src/test/java/resources/1.jpg"));
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(Condition.text("Thanks for submitting the form"));
        $$(".table-responsive tr").shouldHave(CollectionCondition.texts
                ("Label Values",
                "Student Name Alexander Ignatenko",
                "Student Email LainQa63@gmail.com",
                "Gender Male",
                "Mobile 1234567890",
                "Date of Birth 10 October,1995",
                "Subjects Maths",
                "Hobbies Music",
                "Picture 1.jpg",
                "Address Samarskaya oblast",
                "State and City Haryana Panipat"));
    }
}