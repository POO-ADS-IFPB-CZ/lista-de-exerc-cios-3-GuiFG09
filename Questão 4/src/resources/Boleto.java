package resources;

public class Boleto extends Pagamento {
    private static final double DESCONTO = 0.10;

    @Override
    public void processar(double valor) {
        double valorFinal = valor - (valor * DESCONTO);
        System.out.printf("Pagamento com Boleto: R$ %.2f (10%% de desconto aplicado)%n", valorFinal);
    }
}