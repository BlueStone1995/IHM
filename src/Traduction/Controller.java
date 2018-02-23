package Traduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class Controller {
	@FXML
	private ToggleGroup toggleGroupIn;

	@FXML
	private ToggleGroup toggleGroupOut;

	private Model model = new Model();

	@FXML
	private TextArea textIn;

	@FXML
	private TextArea textOut;

	@FXML
	private void processTranslation(ActionEvent event) {

		// Récupère entrées de l'utilisateur
		String inLan = ((ToggleButton) toggleGroupIn.getSelectedToggle()).getText();
		String outLan = ((ToggleButton) toggleGroupOut.getSelectedToggle()).getText();
		String textToTranslate = textIn.getText();

		// Récupère traduction via le Model
		String traduction = model.translate(textToTranslate, inLan, outLan);

		// Affiche résultat dans textOut
		textOut.setText(traduction);
	}
}