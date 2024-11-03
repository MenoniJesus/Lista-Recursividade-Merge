public class SomaInteiros {
    public static int somaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return (numero % 10) + somaDigitos(numero / 10);
        }
    }
}