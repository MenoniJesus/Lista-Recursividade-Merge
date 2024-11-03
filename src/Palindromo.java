public class Palindromo {
    public static boolean palindromo(String palavra, int inicio, int fim) {
        System.out.println(inicio + " " + fim);
        if (inicio < fim) {
            if (palavra.charAt(inicio) == palavra.charAt(fim)) {
                return palindromo(palavra, inicio + 1, fim - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}