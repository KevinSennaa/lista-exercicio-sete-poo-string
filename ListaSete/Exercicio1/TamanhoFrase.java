import java.util.Scanner;

public class TamanhoFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Frase frase = new Frase();

            System.out.println("Digite a primerira frase: ");
            frase.setStringUm(scanner.nextLine());

            System.out.println("Digite a segunda frase: ");
            frase.setStringDois(scanner.nextLine());

            System.out.println("\nFrase um contém: " + frase.getStringUm().length() + " letras");
            System.out.println("Frase dois contém: "+ frase.getStringDois().length() + " letras");

            if(frase.getStringUm().length() != frase.getStringDois().length()) {
                System.out.println("\nAAs duas frases são de tamanhos diferentes. ");
                } else{
                System.out.println("\nAs duas frases são de tamanhos iguais. ");
                }
                if(!frase.getStringDois().equalsIgnoreCase(frase.getStringUm())){
                System.out.println("As frases tem conteúdo diferente. ");
                }else{
                System.out.println("As frases tem conteúdo iguais. ");
            }

        scanner.close();
    }
}