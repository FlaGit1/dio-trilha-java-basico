package Desafios.Desafio3;

import java.util.Arrays;
import java.util.List;

/* Neste código, a lista numeros é convertida em uma stream, e o método allMatch() é usado para verificar se todos 
os números são maiores que zero. */

public class VerificarPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream()
        .allMatch(num -> num > 0);

        System.out.println("Todos os números são positivos? " + todosPositivos);
    }
}
