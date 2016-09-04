package tutorial.android.sgarts.unoscorer.database;

public class DroidUtils {
    public static boolean isStringValid(String string) {
        if (string == null) {
            return false;
        }
        if (string.isEmpty()) {
            return false;
        }
        if ("".equals(string)) {
            return false;
        }
        return true;
    }

    public static String enclose(String value) {
        return " '" + value + "' ";
    }
}
