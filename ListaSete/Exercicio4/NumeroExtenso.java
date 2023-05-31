import java.util.Scanner;

public class NumeroExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            FuncaoNumero funcaoNumero = new FuncaoNumero();

            System.out.println("Digite um número até 99. ");
            
            System.out.println("Digite um número: ");
            funcaoNumero.setNumero(scanner.nextInt());
            funcaoNumero.numeroExtenso();
        
        scanner.close();    

    }
    
}
