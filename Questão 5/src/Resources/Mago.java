package Resources;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 8);
    }

    @Override
    public void atacar() {
        System.out.printf("%s lança uma bola de fogo, causando %d de dano mágico!%n", nome, forca * 3);
    }
}

