package Resources;

public abstract class Personagem {
    protected String nome;
    protected int forca;

    public Personagem(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    public abstract void atacar();
}
