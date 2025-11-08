import Resources.Arqueiro;
import Resources.Guerreiro;
import Resources.Mago;
import Resources.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
                new Guerreiro("Thorin"),
                new Mago("Gandalf"),
                new Arqueiro("Legolas")
        };

        System.out.println("=== Início do turno de combate ===");

        for (Personagem p : personagens) {
            p.atacar();
        }

        System.out.println("=== Fim do turno ===");
    }
}
