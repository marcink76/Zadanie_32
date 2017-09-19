import java.util.Locale;

import static java.lang.System.out;

public class ShowResult {
    public static void showResult(double result, String shapeName){
        out.printf(Locale.ROOT,"%s wynosi: %.2f\n", shapeName, result);

    }
}
