package Traduction;

public class Model {

	public String translate(String text, String inLan, String outLan) {

		if (inLan.compareTo("Anglais") == 0 || inLan.compareTo("Français") == 0 || inLan.compareTo("Allemand") == 0) {
			if (outLan.compareTo("Anglais") == 0) {
				return "Texte en Anglais";
			} else if (outLan.compareTo("Français") == 0) {
				return "Texte en Français";
			} else if (outLan.compareTo("Allemand") == 0) {
				return "Texte en Allemand";
			}
		}
		return "bonjour";
	}
}