package Messagerie;

import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class Controlleur {
	
	@FXML
	private TextArea destinataire;

	@FXML
	private TextArea objet;
	
	@FXML
	private TextArea textM;
	
	@FXML
	private TextArea confirm;

	private Model model = new Model();
	
	@FXML
	public void envoyer(ActionEvent event) {
		String dest = destinataire.getText();
		
		String obj = objet.getText();
		String text = textM.getText();
		
		String rep = model.send(dest, obj, text);
		confirm.setText(rep);

	}

}
