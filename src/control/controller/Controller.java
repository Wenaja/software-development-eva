package control.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;

@ManagedBean
@SessionScoped
public class Controller {
	private User user;
	private UIComponent uicomponent;
	
	public Controller() {
		user = new User();
	}
	
	
	public String redirect() {
		return "index";
	}
	
	public User getUser() {
		//uicomponent = UIComponent.getCurrentComponent(FacesContext.getCurrentInstance());
		//user.setUicomponent(uicomponent);
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
