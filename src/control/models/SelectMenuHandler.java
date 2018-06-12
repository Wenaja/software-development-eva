package control.models;

import java.util.ArrayList;
import java.util.List;

public class SelectMenuHandler {
	private List<String> items;
	
	public void initialize() {
		this.items = new ArrayList<String>();
		
		items.add("Huffman");
		items.add("Shannon-Fano");
		
	}
	
	public List<String> getItems(){
		return items;
	}

}
