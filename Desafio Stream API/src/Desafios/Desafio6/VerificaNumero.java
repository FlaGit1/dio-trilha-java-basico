package Desafios.Desafio6;

import java.util.Arrays;
import java.util.List;

/* Este código faz o seguinte:

Cria uma lista de números.
Usa a Stream API para verificar se algum número na lista é maior que 10.
Exibe o resultado no console. */

public class VerificaNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 5, 4, 3);

        boolean existeMaiorQueDez = numeros.stream()
        .anyMatch(n -> n > 10);

        System.out.println("A lista contém algum número maior que 10? " + existeMaiorQueDez);
    }
}
