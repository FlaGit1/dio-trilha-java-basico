package Desafios.Desafio2;

import java.util.Arrays;
import java.util.List;

/* Neste código, a lista numeros é convertida em uma stream, os números pares são filtrados com o método filter(), 
convertidos para int com mapToInt(), e somados com o método sum(). */

public class SomaNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
        .filter(num -> num % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("A soma dos números pares é: " + somaPares);

    }
}
