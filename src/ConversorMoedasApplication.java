import java.util.Scanner;

public class ConversorMoedasApplication {
    public static void main(String[] args) {
        String azul = "\033[34m";
        String reset = "\033[0m";

        Scanner scanner = new Scanner(System.in);
        int menuOpcao;

        do {
            System.out.println(azul + """
                *---------------------------------*
                *   ALURA - ONE                   *
                *   Sistema Conversor de Moedas   *
                *---------------------------------*
                """ + reset
            );

            System.out.println("Selecione a opção de conversão:");
            System.out.println("1. BRL para USD");
            System.out.println("2. USD para BRL");
            System.out.println("3. BRL para EUR");
            System.out.println("4. EUR para BRL");
            System.out.println("5. BRL para AUD");
            System.out.println("6. AUD para BRL");
            System.out.println("7. BRL para todas (USD, EUR, AUD)");
            System.out.println("8. Encerrar aplicação");
            System.out.print("Opção: ");
            menuOpcao = scanner.nextInt();

        } while (menuOpcao != 8);

        System.out.println("Aplicação encerrada.");
        scanner.close();
    }

}
