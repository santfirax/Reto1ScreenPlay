package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.RegistrationForm;
import co.com.proyectobase.screenplay.questions.TheWebTable;
import co.com.proyectobase.screenplay.tasks.Performs;
import co.com.proyectobase.screenplay.ui.AutomationDemonSite;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class AutomationDemonSiteDefinitions {
	private AutomationDemonSite automationDemonSite = new AutomationDemonSite();
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor Carlos = Actor.named("Carlos");

	@Before
	public void initialSetup() {
		Carlos.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Carlos wants to acces to Automation Demon Website$")
	public void thatCarlosWantsToAccesToAutomationDemonWebsite() throws Exception {
		Carlos.wasAbleTo(Open.browserOn(automationDemonSite));
	}

	@When("^he performs the registration on the page$")
	public void hePerformsTheRegistrationOnThePage(List<RegistrationForm> registrationForm) throws Exception {
		Carlos.attemptsTo(Performs.registrationForm(registrationForm));

	}

	@Then("^he visualize the proccess confirmation message$")
	public void heVisualizeTheProccessConfirmationMessage(List<RegistrationForm> registrationForm) throws Exception {
		Carlos.should(seeThat(TheWebTable.content(registrationForm), equalTo(true)));
	}

}
