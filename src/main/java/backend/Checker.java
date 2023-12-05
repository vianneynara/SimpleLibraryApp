package backend;

public class Checker {
    /**
     * Mengecek apakah sebuah {@link String} kosong setelah dilakukan trimming.
     *
     * @return boolean true atau false
     * */
    public static boolean stringIsEmpty(String str) {
        return str.trim().isEmpty();
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka, spasi, dan strip.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isNomorSpaceHyphen(String str) {
        return str.matches("^[0-9\\s\\-]+$");
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari huruf dan spasi.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isAlphabetSpace(String str) {
        return str.matches("^[a-zA-Z\\s]+$");
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari huruf dan spasi dengan jumlah minimal.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isAlphabetSpace(String str, int min) {
        return str.matches(String.format("^[a-zA-Z\\s]{%d,}$", min));
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka.
     *
     * @param str {@link String} yang akan dicek
     * @return boolean true atau false
     * */
    public static boolean isNomor(String str) {
        return str.matches("^[0-9]+$");
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka dan harus sebanyak n digit.
     *
     * @param str {@link String} yang akan dicek
     * @param digits jumlah karakter angka / digit yang sesuai
     * @return boolean true atau false
     * */
    public static boolean isNomor(String str, int digits) {
        return str.matches(String.format("^\\d{%d}$", digits));
    }

    /**
     * Mengecek apakah sebuah {@link String} terdiri hanya dari angka dan harus minimal sebanyak n digit.
     *
     * @param str {@link String} yang akan dicek
     * @param min jumlah minimal digit
     * @param max jumlah maksimal digit, -1 untuk tidak menggunakan max
     * @return boolean true atau false
     * */
    public static boolean isNomor(String str, int min, int max) {
        return str.matches(String.format("^\\d{%s,%s}$", min, (max == -1) ? "" : max));
    }
}
