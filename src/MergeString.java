public class MergeString {
    public static void mergeSortString(String[] array) {
        if (array.length < 2) {
            return;
        }
        String[] aux = new String[array.length];
        mergeSort(array, aux, 0, array.length - 1);
    }

    private static void mergeSort(String[] array, String[] aux, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(array, aux, inicio, meio);
            mergeSort(array, aux, meio + 1, fim);
            merge(array, aux, inicio, meio, fim);
        }
    }

    private static void merge(String[] array, String[] aux, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            aux[i] = array[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;
        int atual = inicio;

        while (esquerda <= meio && direita <= fim) {
            if (aux[esquerda].compareTo(aux[direita]) <= 0) {
                array[atual] = aux[esquerda];
                esquerda++;
            } else {
                array[atual] = aux[direita];
                direita++;
            }
            atual++;
        }

        while (esquerda <= meio) {
            array[atual] = aux[esquerda];
            esquerda++;
            atual++;
        }
    }
}