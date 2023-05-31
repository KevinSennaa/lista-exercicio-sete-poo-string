import java.util.Scanner;

public class VerificacaoCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            FuncaoCpf funcaoCpf = new FuncaoCpf();

            System.out.println("Verficação de CPF. ");

            System.out.println("Digite seu cpf em xxx.xxx.xxx-xx: ");
            funcaoCpf.setCpf(scanner.nextLine());

            if(funcaoCpf.getCpf().charAt(3)== '.' && funcaoCpf.getCpf().charAt(7)== '.' && funcaoCpf.getCpf().charAt(11)== '-' && funcaoCpf.getCpf().length()==14) {
                System.out.println("CPF válido.");
            } else {
                System.out.println("CPF inválido.");
            }
  
        scanner.close();
    }
}
    
