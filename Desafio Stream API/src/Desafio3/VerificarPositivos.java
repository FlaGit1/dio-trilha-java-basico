package Desafio3;

import java.util.Arrays;
import java.util.List;

public class VerificarPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream()
        .allMatch(num -> num > 0);

        System.out.println("Todos os números são positivos? " + todosPositivos);
    }
}
