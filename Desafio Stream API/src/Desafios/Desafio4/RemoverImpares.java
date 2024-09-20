package Desafios.Desafio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Neste código, a lista numeros é convertida em uma stream, os números pares são filtrados
com o método filter() (que mantém apenas os números que são divisíveis por 2), 
e a lista resultante é coletada de volta em uma lista com collect(Collectors.toList()). */

public class RemoverImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
        .filter(num -> num % 2 == 0)
        .collect(Collectors.toList());

        System.out.println(numerosPares);
    }
}
