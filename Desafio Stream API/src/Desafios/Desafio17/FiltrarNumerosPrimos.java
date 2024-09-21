package Desafios.Desafio17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para filtrar os números primos usando o método isPrime.
Coleta os números primos em uma nova lista (collect(Collectors.toList())).
Exibe a lista de números primos no console. */

public class FiltrarNumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
        .filter(FiltrarNumerosPrimos::isPrime)
        .collect(Collectors.toList());

        System.out.println("Números primos da lista: " + numerosPrimos);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
        .noneMatch(n -> number % n == 0);
    }
}
