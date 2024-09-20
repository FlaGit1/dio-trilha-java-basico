package Desafios.Desafio8;

import java.util.Arrays;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para transformar cada número em uma sequência de seus dígitos (flatMap e chars).
Converte os caracteres de volta para inteiros (mapToObj e Character.getNumericValue).
Soma todos os dígitos (sum).
Exibe o resultado no console. */

public class SomaDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
        .flatMap(n -> String.valueOf(n).chars().mapToObj(c -> Character.getNumericValue(c)))
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }
}
