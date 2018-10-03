package co.com.proyectobase.screenplay.questions;

import java.util.List;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ToList implements Question<Boolean> {
	private Target target;
	private String checkData;
	public ToList(Target target, String checkData) {
		this.target = target;
		this.checkData = checkData;
	}
	

	@Override
	public Boolean answeredBy(Actor actor) {
		
		return checkData(actor);
	}
	public boolean checkData(Actor actor) {
		List<WebElement> contentData = target.resolveFor(actor).findElements(By.tagName("ng-repeat"));
		for(int i=0;i<contentData.size();i++) {
			if(contentData.get(i).getText().contains(checkData)) {
				  
				return true;
			}
			
		}
		return false;
	}

	public static ToList webContent(Target target, String checkData) {
		
		return new ToList(target,checkData);
	}

}
