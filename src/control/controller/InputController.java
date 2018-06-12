package control.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import control.models.InputContainer;
import control.models.SelectMenuHandler;

@ManagedBean
@RequestScoped
public class InputController {
	private InputContainer text;
	private SelectMenuHandler items;
	
	public InputController() {
		
	}
	
	
	@PostConstruct
	public void initialize() {
		text = new InputContainer();
		items = new SelectMenuHandler();
		
		items.initialize();
		text.setInputText(items.getItems().get(0));
		
	}
	
	public SelectMenuHandler getItems() {
		return items;
		
	}
	
	public InputContainer getText() {
		return text;
	}

	public void setText(InputContainer text) {
		this.text = text;
	}

	public String redirect() {
		return "index";
	}
	
	public String goBackToIndex() {
		return "index";
	}
}
