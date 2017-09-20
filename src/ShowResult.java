import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ShowResult {
    public static void showResult(double result, String shapeName){
        String unit;

        Pattern pattern = Pattern.compile("Pole");
        Matcher matcher = pattern.matcher(shapeName);
        if (!matcher.find()){
            unit = "mm";
        } else {unit = "mm^2";}

        out.printf(Locale.ROOT,"%s wynosi: %.2f%s\n", shapeName, result, unit);

    }
}
