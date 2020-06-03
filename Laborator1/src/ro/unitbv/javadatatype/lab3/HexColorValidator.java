package ro.unitbv.javadatatype.lab3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValidator {
	public static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

	Boolean valid(String hex) {
		
		Pattern pattern = Pattern.compile(HEX_PATTERN);
		Matcher matcher = pattern.matcher(hex);
		return matcher.matches();
	}
}
