package Desafios.Desafio14;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para converter a lista em um IntStream.
Filtra os números para manter apenas os primos usando o método isPrime.
Encontra o maior número primo usando o método max.
Exibe o maior número primo no console. */

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt maiorPrimo = numeros.stream()
        .mapToInt(Integer::intValue)
        .filter(MaiorNumeroPrimo::isPrime)
        .max();

        maiorPrimo.ifPresentOrElse(
            n -> System.out.println("O maior número primo da lista é: " + n),
            () -> System.out.println("Não há números primos na lista.")
        );
    }
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
        .noneMatch(n -> number % n == 0);
    }

}
