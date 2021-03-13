package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {

List <String> listaParole;

	
	public Parole() {
		
		listaParole= new LinkedList <String>();
		
	}
	
	

	public void addParola(String p) {
		
		listaParole.add(p);
		
	}
	


	public List<String> getElenco() {
		Collections.sort(listaParole, new CompParoleAlfabeticamente());
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}



	@Override
	public String toString() {
		String res="";
		this.getElenco();
		for(int i=0; i< listaParole.size();i++) {
			res+= listaParole.get(i)+'\n';
		}
		
		return "Parole inserite:"+'\n'+ res;
	}

}
