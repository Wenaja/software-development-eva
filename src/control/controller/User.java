package control.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;

@ManagedBean
@SessionScoped
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
