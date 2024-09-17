package candidatos;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1758.87);
        analisarCandidato(2140.23);
        analisarCandidato(2000.0);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}
