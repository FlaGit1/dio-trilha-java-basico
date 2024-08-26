public class BancoTerminal {
    
public static void main(String[] args){

    
    double Saldo = 25;
    double ValorSolicitado = 18;

    if(Saldo >= ValorSolicitado) {
        Saldo -= ValorSolicitado;

    } else {
        System.out.println("Saldo Insulficiente");        
    }

    System.out.println("Saldo Atual: " + Saldo);
        
        // Execução com outros valores
        Saldo = 15;
        ValorSolicitado = 22;

        if (Saldo >= ValorSolicitado) {
            Saldo -= ValorSolicitado;

        } else {
            System.out.println("Saldo atual: " + Saldo);
        }

        System.out.println("Saldo Insulficiente");
}

}