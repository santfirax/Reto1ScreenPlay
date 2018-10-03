package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemonSite extends PageObject {

	public static final Target FIRST_NAME_FIELD = Target.the("first name field")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input"));
	public static final Target LAST_NAME_FIELD = Target.the("last name field")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"));
	public static final Target ADDRESS_FIELD = Target.the("address field")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea"));
	public static final Target EMAIL_ADDRESS_FIELD = Target.the("email address field")
			.located(By.cssSelector("#eid > input"));
	public static final Target PHONE_FIELD = Target.the("phone field")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
	public static final Target SELECT_GENDER = Target.the("select gender")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input"));
	public static final Target LANGUAGE_FIELD = Target.the("language list").located(
			By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul"));
	public static final Target SELECT_HOBBIES = Target.the("selecthobbies").located(By.id("checkbox2"));
	public static final Target SELECT_SKILLS = Target.the("select skills").located(By.cssSelector("#Skills"));
	public static final Target LANGUAGE = Target.the("language field").located(By.id("msdd"));
	public static final Target COUNTRY_FIELD = Target.the("first country select").located(By.cssSelector("#countries"));
	public static final Target LANGUAGES_EXIT = Target.the("exit from languages")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(8) > label"));
	public static final Target COUNTRY_MENU = Target.the("country meu").located(By.cssSelector(
			"#basicBootstrapForm > div:nth-child(10) > div > span > span.selection > span > span.select2-selection__arrow"));
	public static final Target COUNTRY_MENU_FIELD = Target.the("country menu field")
			.located(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
	public static final Target YEAR_FIELD = Target.the("year field").located(By.cssSelector("#yearbox"));
	public static final Target MONTH_FIELD = Target.the("month field")
			.located(By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select "));
	public static final Target DAY_FIELD = Target.the("day_field").located(By.id("daybox"));
	public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("firstpassword"));
	public static final Target PASSWORD_CONFIRM_FIELD = Target.the("confirm password field")
			.located(By.id("secondpassword"));
	public static final Target SUBMIT_BUTTON = Target.the("submit button").located(By.id("submitbtn"));
}
