public class OcCaracter {
    public static int ocCaracter(String palavra, int inicio, char letra){
        int vezes = 0;

        if(inicio <= palavra.length() - 1){
            if(palavra.charAt(inicio) == letra){
                vezes += 1;
            }
            return vezes + ocCaracter(palavra, inicio + 1, letra);
        }
        return vezes;
    }
}