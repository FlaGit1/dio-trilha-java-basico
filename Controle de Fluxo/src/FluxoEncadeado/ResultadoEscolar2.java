package FluxoEncadeado;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 10;

        if(nota >= 7)
        System.out.println("APROVADO");

        else if(nota >= 5 && nota < 7)//true ou false
        System.out.println("RECUPERAÇÃO");

        else
        System.out.println("REPROVADO");
    }
    
}
