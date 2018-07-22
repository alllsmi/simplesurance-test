package cases;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import infrastructure.Context;
import pages.LoginPage;
import pages.PartnerPortalPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Context.driver());
    PartnerPortalPage partnerPortalPage = new PartnerPortalPage(Context.driver());

    @When("^user opens login page$")
    public void login() {
        loginPage.navigate();
    }

    @When("^user login as '(.*)', '(.*)'$")
    public void loginAs(String login, String password) throws Throwable {
        loginPage.enterUserData(login, password).clickLogin();
    }

    @Then("^user gets error '(.*)'$")
    public void userGetsError(String error) throws Throwable {
        loginPage.verifyError(error);
    }

    @Then("^user is successfully logged in$")
    public void loginSuccess() throws Throwable {
        partnerPortalPage.verifyOpened();
    }
}
