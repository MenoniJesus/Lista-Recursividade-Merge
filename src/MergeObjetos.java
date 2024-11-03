public class MergeObjetos {
    public static void mergeSort(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(pessoas, auxiliar, inicio, meio);
            mergeSort(pessoas, auxiliar, meio + 1, fim);
            intercalacao(pessoas, auxiliar, inicio, meio, fim);
        }
    }

    private static void intercalacao(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int meio, int fim) {
        for (int x = inicio; x <= fim; x++) {
            auxiliar[x] = pessoas[x];
        }
        int esquerda = inicio;
        int direita = meio + 1;

        for (int x = inicio; x <= fim; x++) {
            if (esquerda > meio) {
                pessoas[x] = auxiliar[direita++];
            } else if (direita > fim) {
                pessoas[x] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda].idade <= auxiliar[direita].idade) {
                pessoas[x] = auxiliar[esquerda++];
            } else {
                pessoas[x] = auxiliar[direita++];
            }
        }
    }
}
