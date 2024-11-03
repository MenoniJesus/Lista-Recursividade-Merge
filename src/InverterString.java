public class InverterString {
    public static String inverterString(String palavra, int i) {
        if (i == palavra.length() - 1) {
            return palavra.charAt(i) + "";
        }
        return inverterString(palavra, i + 1) + palavra.charAt(i);
    }
}
