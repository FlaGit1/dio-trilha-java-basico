package Desafios.Desafio18;

import java.util.Arrays;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para remover duplicatas (distinct()).
Conta o número de elementos distintos na lista (count()).
Verifica se o número de elementos distintos é igual a 1.
Exibe o resultado no console. */

public class VerificaNumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
        .distinct()
        .count() == 1;

        System.out.println("Todos os números são iguais? " + todosIguais);
    }
}
