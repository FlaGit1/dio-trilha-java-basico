package Desafios.Desafio16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para agrupar os números em pares e ímpares usando partitioningBy.
Separa os números pares e ímpares em duas listas distintas.
Exibe as listas de números pares e ímpares no console */

public class AgruparParesImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> agrupados = numeros.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> pares = agrupados.get(true);
        List<Integer> impares = agrupados.get(false);

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
