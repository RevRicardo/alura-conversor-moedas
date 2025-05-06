package response;

public class MoedaResponse {
    public static void exibirResultado(String moedaBase, String moedaDestino, double taxa, double valorConvertido) {
        System.out.println("A moeda " + moedaBase + " será convertida para " + moedaDestino);
        System.out.printf("A taxa de conversão é: %.4f%n", taxa);
        System.out.printf("Valor da moeda convertido é: %.2f%n", valorConvertido);
    }
}

