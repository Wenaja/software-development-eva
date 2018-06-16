package control.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import control.models.InputContainer;
import control.models.SelectMenuHandler;
import model.control.Orb;

@ManagedBean
@RequestScoped
public class InputController {
	private Boolean rendered;
	
	private InputContainer text;
	private SelectMenuHandler items;
	
	
	Orb orb;
	
	public InputController() {
		
	}
	
	
	@PostConstruct
	public void initialize() {
		rendered = new Boolean("false");
		orb = new Orb();
		text = new InputContainer();
		items = new SelectMenuHandler();
		
		items.initialize();
		text.setInputText(items.getItems().get(0));
		
	}
	
	
	public String redirect() {
		String input = text.getInputText();
		if(!input.isEmpty()) {
			orb.takeInputToControl(text.getInputText());
			rendered = true;
		}
		
		return "index";
	}
	
	public String goBackToIndex() {
		return "index";
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


	public Orb getOrb() {
		return orb;
	}


	public void setOrb(Orb orb) {
		this.orb = orb;
	}


	public Boolean isRendered() {
		return rendered;
	}

}
