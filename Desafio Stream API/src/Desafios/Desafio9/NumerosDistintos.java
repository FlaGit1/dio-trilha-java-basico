package Desafios.Desafio9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para verificar se todos os números são distintos.
Utiliza um HashSet para adicionar cada número e verifica se a adição foi bem-sucedida (allMatch(new HashSet<>()::add)).
Exibe o resultado no console. */

public class NumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
        .allMatch(new HashSet<>()::add);

        System.out.println("Todos os números são distintos? " + todosDistintos);
    }
}
