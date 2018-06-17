package control.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import control.models.InputDataContainer;
import control.models.OutputDataContainer;
import control.models.SelectMenuHandler;
import model.control.Orb;

@ManagedBean
@RequestScoped
public class InputController {
	private Boolean rendered;

	private InputDataContainer inputData;
	private OutputDataContainer outputData;
	private SelectMenuHandler selectMenuItems;
	private Orb orb;

	
	public InputController() {

	}

	@PostConstruct
	public void initialize() {
		rendered = new Boolean("false");
		orb = new Orb();
		inputData = new InputDataContainer();
		outputData = new OutputDataContainer();
		selectMenuItems = new SelectMenuHandler();

		selectMenuItems.initialize();
		inputData.setInputText(selectMenuItems.getItems().get(0));

	}

	public String redirect() {
		takeInputTextToOrbControl();
		tranferInputToDigitalForm();
		produceCompressionSet();
		setRenderedProperty();
	
		return "index";
	}

	private void takeInputTextToOrbControl() {
		if(!inputData.getInputText().isEmpty()) {
			orb.takeInputToControl(inputData.getInputText());
		}
	}

	private void tranferInputToDigitalForm() {
		if (!inputData.getInputText().isEmpty()) {
			outputData.setOutputDigitalFigure(orb.getASCIIText());
			
		} else {
			outputData.setOutputDigitalFigure("Caution: Item is empty!");
			
		}

	}

	private void produceCompressionSet() {
		if (inputData.getSelectedItem().equals("Huffman")) {
			outputData.setOutputCompressionFigure(orb.getHuffmanCode());
			
		} else if (inputData.getSelectedItem().equals("Shannon-Fano")) {
			outputData.setOutputCompressionFigure(orb.getShannonCode());
			
		} else {
			outputData.setOutputCompressionFigure("Keine Ahnung was los ist :(");
			
		}
	}

	private void setRenderedProperty() {
		if (inputData.getChekbox()) {
			rendered = true;
		} else {
			rendered = false;
		}
	}

	public String goBackToIndex() {
		return "index";
	}

	public SelectMenuHandler getSelectMenuItems() {
		return selectMenuItems;

	}

	public InputDataContainer getInputData() {
		return inputData;
	}

	public void setInputData(InputDataContainer inputData) {
		this.inputData = inputData;
	}

	public OutputDataContainer getOutputData() {
		return outputData;
	}

	public void setOutputData(OutputDataContainer outputData) {
		this.outputData = outputData;
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
