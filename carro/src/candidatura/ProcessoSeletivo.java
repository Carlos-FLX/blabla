package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args){
        System.out.println("Processo seletivo");
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
        else if (salarioPretendido > salarioBase) {
            System.out.println("Ligar para negociar com o candidato");
        }
    }
}
