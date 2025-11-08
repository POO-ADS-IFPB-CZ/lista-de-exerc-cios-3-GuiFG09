import resources.Boleto;
import resources.CartaoCredito;
import resources.Pagamento;
import resources.Pix;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();

        System.out.println("=== Processando Pagamentos ===");
        p1.processar(100.0);
        p2.processar(100.0);
        p3.processar(100.0);
    }
}
