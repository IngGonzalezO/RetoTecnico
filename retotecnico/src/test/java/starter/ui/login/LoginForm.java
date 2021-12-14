package starter.ui.login;

import org.openqa.selenium.By;

public class LoginForm {
    public static By NAME_FIELD = By.id("firstName");
    public static By LASTNAME_FIELD = By.id("lastName");
    public static By EMAIL_FIELD = By.id("email");
    public static BY BIRTHMONTH_FIELD = By.id("birthMonth");
    public static BY BIRTHDAY_FIELD = By.id("birthDay");
    public static BY BIRTHYEAR_FIELD = By.id("birthYear");
    public static By NEXT_BUTTON = By.id("//button [contains (@class, 'btn btn-primary')]");
    public static By ZIP_FIELD = By.id("zip");
    public static By DIVICE_BUTTON = By.id("//button [contains (@class, 'btn btn-primary')]");
    public static By STEP_BUTTON = By.id("//button [contains (@class, 'btn btn-primary')]");
    public static By PASSWORD_FIELD = By.id("password");
    public static By CONPASSWORD_FIELD = By.id("confirmPassword");
    public static By TERM = By.cssSelector("input.form-check-input");
    public static By ACCEPT = By.cssSelector("input.form-check-input");
    public static By CONFIRM_BUTTON = By.id("//button [contains (@class, 'btn btn-primary')]");
}
