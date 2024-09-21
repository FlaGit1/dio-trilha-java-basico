package Desafios.Desafio19;

import java.util.Arrays;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para filtrar os números que são divisíveis tanto por 3 quanto por 5 (filter(n -> n % 3 == 0 && n % 5 == 0)).
Converte os números filtrados para um IntStream.
Soma todos os números filtrados (sum).
Exibe o resultado no console. */

public class SomaDivisiveisPor3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
        .filter(n -> n % 3 == 0 && n % 5 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);
    }
}
