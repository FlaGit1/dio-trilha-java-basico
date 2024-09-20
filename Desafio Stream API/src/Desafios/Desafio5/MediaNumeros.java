package Desafios.Desafio5;

import java.util.Arrays;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para filtrar os números maiores que 5.
Converte os números filtrados para um IntStream.
Calcula a média dos números filtrados.
Exibe a média no console. */

public class MediaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = numeros.stream()
        .filter(n -> n > 5)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);

        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
