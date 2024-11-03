import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------\nEX-1");
        String palavra = "arara";
        System.out.println(Palindromo.palindromo(palavra, 0, palavra.length() - 1));


        System.out.println("---------------------------------------\nEX-2");
        int[] opa = {5, 6, 7, 8};
        int sla = SomaArray.somaArray(opa, 0);
        System.out.println("A soma é: " + sla);

        System.out.println("---------------------------------------\nEX-3");
        String palavra2 = "objeto";
        char letra = 'o';
        int numeroVezes = OcCaracter.ocCaracter(palavra2, 0, letra);
        System.out.println("O numero de vezes que a letra '" + letra + "' apareceu na palavra '" + palavra2 + "' foi: " + numeroVezes);

        System.out.println("---------------------------------------\nEX-4");
        int n = 6;
        int fib = FibonacciX.fibonacci(n);
        System.out.println("O " + n + "º número da sequência de Fibonacci é: " + fib);

        System.out.println("---------------------------------------\nEX-5");
        int numero = 1234;
        int soma = SomaInteiros.somaDigitos(numero);
        System.out.println("A soma dos digitos do número " + numero + " é: " + soma);

        System.out.println("---------------------------------------\nEX-6");
        String palavra3 = "tatu";
        String palavraInvertida = InverterString.inverterString(palavra3, 0);
        System.out.println("A palavra '" + palavra3 + "' invertida é: " + palavraInvertida);

        System.out.println("---------------------------------------\nEX-7");
        int[][] matriz = {
                {2, 1, 4, 5, 3, 7, 8},
                {9, 6, 3, 2, 8, 5, 1},
                {8, 11, 1, 55, 6, 2, 0}
        };

        MergeMatriz.mergeSortMatrix(matriz);

        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }

        System.out.println("---------------------------------------\nEX-8");
        Pessoa pessoas[] = {
                new Pessoa("João", 20),
                new Pessoa("Maria", 30),
                new Pessoa("José", 25),
                new Pessoa("Ana", 22),
                new Pessoa("Pedro", 40),
                new Pessoa("Carla", 35),
                new Pessoa("Lucas", 28),
                new Pessoa("Mariana", 23),
                new Pessoa("Paulo", 45),
                new Pessoa("Juliana", 32)
        };

        Pessoa[] auxiliar = new Pessoa[pessoas.length];
        MergeObjetos.mergeSort(pessoas, auxiliar, 0, pessoas.length - 1);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.nome + " - " + pessoa.idade);
        }

        System.out.println("---------------------------------------\nEX-9");
        String[] palavras = {"casa", "carro", "moto", "bicicleta", "aviao", "navio", "trem", "onibus", "metro", "barco"};
        MergeString.mergeSortString(palavras);
        for (String palavraOrdenada : palavras) {
            System.out.print(palavraOrdenada + " ");
        }
    }
}
