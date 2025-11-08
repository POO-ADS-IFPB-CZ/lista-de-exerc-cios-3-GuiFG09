package resources;

public class CartaoCredito extends Pagamento {
    private static final double TAXA = 0.05; // 5% de taxa

    @Override
    public void processar(double valor) {
        double valorFinal = valor + (valor * TAXA);
        System.out.printf("Pagamento com Cartão de Crédito: R$ %.2f (Taxa de 5%% incluída)%n", valorFinal);
    }
}
