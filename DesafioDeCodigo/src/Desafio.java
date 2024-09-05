import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner leitorDeEntrada = new Scanner(System.in);
        float valorSalario = leitorDeEntrada.nextFloat();
        float valorBeneficios = leitorDeEntrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribuiu a Alíquota de 5% mediante o salário:
            valorImposto = 0.05f * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            //Atribuiu a Alíquota de 10% mediante o salário:
            valorImposto = 0.10f * valorSalario;
        }
        else {
            //Atribuiu a Alíquota de 15% mediante o salário:
            valorImposto = 0.15f * valorSalario;
        }               
        
        //Calcula e imprime e Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

    }   
}
