package Desafios.Desafio10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AgruparImparesMultiplos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparesMultiplos = numeros.stream()
        .filter(n -> n % 2 != 0)
        .filter(n -> n % 3 == 0 || n % 5 == 0)
        .collect(Collectors.toList());

        System.out.println("Valores ímpares múltiplos de 3 ou de 5: " + imparesMultiplos);
    }
}
