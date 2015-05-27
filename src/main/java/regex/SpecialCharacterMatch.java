package regex;

public class SpecialCharacterMatch {

    public boolean hasSpecialCharacter(final String word) {
	final String regex = "\\W";

	return !word.replaceAll(regex, "").equals("");

    }
}
