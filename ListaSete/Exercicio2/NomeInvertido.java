import java.util.Scanner;

public class NomeInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Nomes nomes = new Nomes();

            System.out.println("Digite o seu nome: ");
            nomes.setNome(nomes.inverterNome(scanner.nextLine()));

            System.out.println("O nome invertido é: " + nomes.getNome());

        scanner.close();

    }
    
}
