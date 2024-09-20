package Desafios.Desafio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para remover duplicatas (distinct()).
Ordena os números em ordem decrescente (sorted(Comparator.reverseOrder())).
Pula o primeiro número (maior) e pega o próximo (skip(1).findFirst()).
Exibe o segundo maior número no console. */

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst();

        segundoMaior.ifPresentOrElse(
            n -> System.out.println("O segundo maior número é: " + n),
            () -> System.out.println("Não há um segundo maior número na lista.")
        );
    }
}
