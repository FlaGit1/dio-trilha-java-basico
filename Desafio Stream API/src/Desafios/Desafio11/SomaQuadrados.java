package Desafios.Desafio11;

import java.util.Arrays;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para mapear cada número ao seu quadrado (mapToInt(n -> n * n)).
Soma todos os quadrados (sum).
Exibe o resultado no console. */

public class SomaQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
        .mapToInt(n -> n * n)
        .sum();

        System.out.println("A soma dos quadrados de todos os números da lista é: " + somaDosQuadrados);
    }
}
