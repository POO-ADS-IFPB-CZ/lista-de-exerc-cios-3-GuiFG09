package Resources;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 10);
    }

    @Override
    public void atacar() {
        System.out.printf("%s ataca com sua espada, causando %d de dano!%n", nome, forca * 2);
    }
}
