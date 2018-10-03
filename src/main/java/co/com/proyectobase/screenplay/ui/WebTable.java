package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;

import net.serenitybdd.screenplay.targets.Target;

public class WebTable {

	public static final Target EDIT_HEADER = Target.the("EDIT_HEADER")
			.located(By.cssSelector("body > section > div:nth-child(1) > div > div:nth-child(2) > h4:nth-child(1)"));
}
