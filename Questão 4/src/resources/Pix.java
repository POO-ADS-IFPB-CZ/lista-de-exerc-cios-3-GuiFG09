package resources;

public class Pix extends Pagamento {
    private static final double DESCONTO = 0.05;

    @Override
    public void processar(double valor) {
        double valorFinal = valor - (valor * DESCONTO);
        System.out.printf("Pagamento via Pix: R$ %.2f (5%% de desconto aplicado)%n", valorFinal);
    }
}