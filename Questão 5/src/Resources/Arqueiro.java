package Resources;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 7);
    }

    @Override
    public void atacar() {
        System.out.printf("%s dispara uma flecha precisa, causando %d de dano à distância!%n", nome, forca * 2 + 5);
    }
}
