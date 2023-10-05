import java.util.regex.Pattern;

public class Checker {
    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka, spasi, dan strip.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isNomorSpaceHyphen(String str) {
        Pattern pattern = Pattern.compile("^[0-9\\s\\-]+$");
        return pattern.matcher(str).matches();
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari huruf dan spasi.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isAlphabetSpace(String str) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s]{3,}$");
        return pattern.matcher(str).matches();
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isNomor(String str) {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        return pattern.matcher(str).matches();
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka dan harus sebanyak n digit.
     *
     * @param str {@link String} yang akan dicek
     * @param digits jumlah karakter angka / digit yang sesuai
     * @return boolean true atau false
     * */
    public static boolean isNomor(String str, int digits) {
        Pattern pattern = Pattern.compile(String.format("^\\d{%d}$", digits));
        return pattern.matcher(str).matches();
    }
}
