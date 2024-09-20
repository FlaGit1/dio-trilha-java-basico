package Desafios.Desafio13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para filtrar os números que estão no intervalo entre 5 e 10 (filter(n -> n >= 5 && n <= 10)).
Coleta os números filtrados em uma nova lista (collect(Collectors.toList())).
Exibe a lista resultante no console. */

public class FiltrarIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNoIntervalo = numeros.stream()
        .filter(n -> n >= 5 && n <= 10)
        .collect(Collectors.toList());

        System.out.println("Números no intervalo entre 5 e 10: " + numerosNoIntervalo);
    }
}
