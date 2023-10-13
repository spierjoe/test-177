package org.primefaces.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


public class MinOneAlphabetic extends BaseValidator {

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String confirmString = (String) value;
		if (confirmString == null || confirmString.isEmpty()) {
			return;
		}
		confirmString = confirmString.trim();


		FacesMessage message = new FacesMessage();
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		message.setSummary((String) component.getAttributes().get("label"));

		Pattern p = Pattern.compile("\\p{L}{1,}");
		Matcher m = p.matcher(confirmString);
		if (!m.find()) {
			message.setDetail("Invalid format. Note: at least 1 letter");
			throw new ValidatorException(message);
		}
	}
	
}

