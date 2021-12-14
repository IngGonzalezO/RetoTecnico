package starter.ui.dashboard;

import org.openqa.selenium.By;

public class DashboardPage {

    public static LeftMenu LEFT_MENU;

    public static final Target NAME_TITLE = Target.the("Extraer un titulo")
            .located(By.id("//h1 [contains (text(), 'Welcome to the world's " +
                    "largest community of freelance software testers!')]"));




}
