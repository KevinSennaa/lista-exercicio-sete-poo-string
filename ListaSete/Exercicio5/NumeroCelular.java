import java.util.Scanner;

public class NumeroCelular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de telefone celular: ");
        String numero = scanner.nextLine();

        String numeroCorrigido = corrigirNumeroTelefone(numero);
        System.out.println("Número corrigido: " + numeroCorrigido);
        
        scanner.close();
    }

    public static String corrigirNumeroTelefone(String numero) {
        // Remove todos os caracteres não numéricos do número
        String numeroApenasDigitos = numero.replaceAll("\\D", "");

        // Verifica o tamanho do número
        if (numeroApenasDigitos.length() == 8) {
            // Acrescenta o '9' na frente do número
            numeroApenasDigitos = "9" + numeroApenasDigitos;
        }

        // Formata o número com o traço separador
        String numeroFormatado = numeroApenasDigitos.replaceFirst("(\\d{4})(\\d{4})", "$1-$2");

        return numeroFormatado;
    }
}