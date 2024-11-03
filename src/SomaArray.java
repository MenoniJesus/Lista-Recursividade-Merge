public class SomaArray {
    public static int soma = 0;

    public static int somaArray(int[] array, int inicio) {
        if (inicio <= array.length -1) {
            soma += array[inicio];
            return somaArray(array, inicio +1);
        }
        return soma;
    }
}
