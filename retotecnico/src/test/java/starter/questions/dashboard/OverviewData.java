package starter.questions.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.ui.dashboard.FinancialOverview;

public class OverviewData {

    public static Question<String> creditAvailable() {
        return actor -> TextContent.of(DashboardPage.NAME_TITLE).viewedBy(actor).asString().trim();
    }



}
