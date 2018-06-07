package control.controller;

import javax.faces.component.UIComponent;

public class User {
	private String text;
	private UIComponent uicomponent;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public UIComponent getUicomponent() {
		return uicomponent;
	}

	public void setUicomponent(UIComponent uicomponent) {
		this.uicomponent = uicomponent;
	}
	

}
