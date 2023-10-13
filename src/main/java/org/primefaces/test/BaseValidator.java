package org.primefaces.test;

import javax.faces.validator.Validator;

import org.apache.commons.lang3.StringUtils;

public abstract class BaseValidator implements Validator<Object> {

	public static final String BORDER_RED = "border-color:#FF0000"; // red
	public static final String DEFAULT_BORDER_GREY = "border-color:#A9A9A9"; // grey

	public static String addBorderstyle(String style) {
		String myStyle = "";
		if (!StringUtils.isEmpty(style)) {
			myStyle = style.concat(";").concat(BORDER_RED);
		} else {
			myStyle = BORDER_RED;
		}
		return myStyle;
	}

}
