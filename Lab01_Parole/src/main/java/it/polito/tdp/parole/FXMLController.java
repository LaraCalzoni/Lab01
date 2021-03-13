package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    String daCancellare = txtResult.getSelectedText();
    elenco.getElenco().remove(daCancellare);
    txtResult.setText(elenco.toString());
    
    }

    @FXML
    void doInsert(ActionEvent event) {
    	
        String pTemp= txtParola.getText();
/*
		if(elenco.getElenco().contains(pTemp)) {    //verifico se la lista contiene già la parola
	    	txtResult.setText(pTemp+": Parola già inserita"+'\n');
	    	}
		else { // se la lista non la contiene...
			elenco.addParola(pTemp);
    		txtResult.setText("Parola inserita con successo"+'\n');
    		
		}
		*/
        if(!elenco.getElenco().contains(pTemp)) {  
        	elenco.addParola(pTemp);
	    	}
		
        txtResult.setText(elenco.toString());
    
    	
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.setText("");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
