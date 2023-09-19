import java.util.regex.Pattern;

public class Checker {
    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka, spasi, dan strip.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isNomorSpaceHyphen(String str) {
        Pattern pola = Pattern.compile("^[0-9\\s\\-]+$");

        return pola.matcher(str).matches();
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isNomor(String str) {
        Pattern pola = Pattern.compile("^[0-9]+$");

        return pola.matcher(str).matches();
    }
}
