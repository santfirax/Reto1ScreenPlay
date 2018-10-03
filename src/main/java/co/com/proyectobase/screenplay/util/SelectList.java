package co.com.proyectobase.screenplay.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SelectList implements Interaction {
	private Target list;
	private String option;
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> listLanguages = list.resolveFor(actor).findElements(By.tagName("li"));
		for(int i=0;i<listLanguages.size();i++) {
			System.out.println(listLanguages.get(i).getText());
			if(listLanguages.get(i).getText().toString().trim().equals(option)) {
				System.out.println(listLanguages.get(i).getText());
				listLanguages.get(i).click();
				break;
			}
		}
		
	}
	public SelectList(Target list, String option) {
		this.list = list;
		this.option = option;
	}
	public static SelectList selectListFrom(Target list, String option) {
		return new SelectList(list, option);
	}
	

}
