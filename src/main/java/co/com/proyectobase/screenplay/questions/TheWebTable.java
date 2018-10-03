package co.com.proyectobase.screenplay.questions;

import java.util.List;

import co.com.proyectobase.screenplay.model.RegistrationForm;
import co.com.proyectobase.screenplay.ui.WebTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWebTable implements Question<Boolean> {
	private List<RegistrationForm> registrationForm;

	public TheWebTable(List<RegistrationForm> registrationForm) {
		this.registrationForm = registrationForm;
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		return Text.of(WebTable.EDIT_HEADER).viewedBy(actor).asString().contains(registrationForm.get(0).getHeaderWebTable());
	}

	public static TheWebTable content(List<RegistrationForm> registrationForm) {

		return new TheWebTable(registrationForm);
	}

}
