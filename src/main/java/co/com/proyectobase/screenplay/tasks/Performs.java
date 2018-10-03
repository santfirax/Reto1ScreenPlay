package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.Keys;

import co.com.proyectobase.screenplay.model.RegistrationForm;
import co.com.proyectobase.screenplay.ui.AutomationDemonSite;
import co.com.proyectobase.screenplay.util.SelectList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Performs implements Task {
	List<RegistrationForm> registrationForm;

	public Performs(List<RegistrationForm> registrationForm) {
		this.registrationForm = registrationForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(registrationForm.get(0).getFirstName()).into(AutomationDemonSite.FIRST_NAME_FIELD));
		actor.attemptsTo(
				Enter.theValue(registrationForm.get(0).getLastName()).into(AutomationDemonSite.LAST_NAME_FIELD));
		actor.attemptsTo(Enter.theValue(registrationForm.get(0).getAddress()).into(AutomationDemonSite.ADDRESS_FIELD));
		actor.attemptsTo(Enter.theValue(registrationForm.get(0).getEmailAddress())
				.into(AutomationDemonSite.EMAIL_ADDRESS_FIELD));
		actor.attemptsTo(Enter.theValue(registrationForm.get(0).getPhone()).into(AutomationDemonSite.PHONE_FIELD));
		actor.attemptsTo(Click.on(AutomationDemonSite.SELECT_GENDER));
		actor.attemptsTo(Click.on(AutomationDemonSite.SELECT_HOBBIES));
		actor.attemptsTo(Click.on(AutomationDemonSite.LANGUAGE));
		actor.attemptsTo(
				SelectList.selectListFrom(AutomationDemonSite.LANGUAGE_FIELD, registrationForm.get(0).getLanguages()));
		actor.attemptsTo(Click.on(AutomationDemonSite.LANGUAGES_EXIT));
		actor.attemptsTo(
				SelectFromOptions.byValue(registrationForm.get(0).getSkills()).from(AutomationDemonSite.SELECT_SKILLS));
		actor.attemptsTo(SelectFromOptions.byValue(registrationForm.get(0).getCountry())
				.from(AutomationDemonSite.COUNTRY_FIELD));
		actor.attemptsTo(Click.on(AutomationDemonSite.COUNTRY_MENU));
		actor.attemptsTo(Enter.theValue(registrationForm.get(0).getSelectCountry())
				.into(AutomationDemonSite.COUNTRY_MENU_FIELD).thenHit(Keys.ENTER));
		actor.attemptsTo(
				SelectFromOptions.byValue(registrationForm.get(0).getYear()).from(AutomationDemonSite.YEAR_FIELD));
		actor.attemptsTo(
				SelectFromOptions.byValue(registrationForm.get(0).getMonth()).from(AutomationDemonSite.MONTH_FIELD));
		actor.attemptsTo(
				SelectFromOptions.byValue(registrationForm.get(0).getDay()).from(AutomationDemonSite.DAY_FIELD));
		actor.attemptsTo(
				Enter.theValue(registrationForm.get(0).getPassword()).into(AutomationDemonSite.PASSWORD_FIELD));
		actor.attemptsTo(Enter.theValue(registrationForm.get(0).getConfirmPassword())
				.into(AutomationDemonSite.PASSWORD_CONFIRM_FIELD));
		actor.attemptsTo(Click.on(AutomationDemonSite.SUBMIT_BUTTON));
		

	}

	public static Performs registrationForm(java.util.List<RegistrationForm> registrationForm) {

		return Tasks.instrumented(Performs.class, registrationForm);
	}

}
