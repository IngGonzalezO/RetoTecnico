package starter.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String name;
    private final String lastname;
    private final String email;
    private final String birthmonth;
    private final String birthday;
    private final String birthyear;
    private final String zip;
    private final String password;
    private final String conpassword;

    public DoLogin(String name, String lastname, String email,
                   String birthmonth, String birthday, String birthyear, String zip,
                   String password, String conpassword) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.zip = zip;
        this.password = password;
        this.conpassword = conpassword;
    }

    public static Performable withCredentials(String name, String lastname, String email,
                                              String birthmonth, String birthday, String birthyear, String zip,
                                              String password, String conpassword) {
        return instrumented(DoLogin.class, name, lastname, email,
                            birthmonth, birthday, birthyear, zip,
                            password, conpassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(LoginForm.NAME_FIELD),
                Enter.theValue(lastname).into(LoginForm.LASTNAME_FIELD),
                Enter.theValue(email).into(LoginForm.EMAIL_FIELD),
                Enter.theValue(birthmonth).into(LoginForm.BIRTHMONTH_FIELD),
                Enter.theValue(birthday).into(LoginForm.BIRTHDAY_FIELD),
                Enter.theValue(birthyear).into(LoginForm.BIRTHYEAR_FIELD),
                Click.on(LoginForm.NEXT_BUTTON),
                Enter.theValue(zip).into(LoginForm.ZIP_FIELD),
                Click.on(LoginForm.DIVICE_BUTTON),
                Click.on(LoginForm.STEP_BUTTON),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Enter.theValue(conpassword).into(LoginForm.CONPASSWORD_FIELD),
                Click.on(LoginForm.CONFIRM_BUTTON)
        );
    }
}
