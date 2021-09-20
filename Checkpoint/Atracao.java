package Checkpoint;

public abstract class Atracao  {
    private String nomeAtracao;
    private String estilo;
    private String palcoPrincipal;

    public Atracao(String nomeAtracao, String estilo, String palcoPrincipal) {
        this.nomeAtracao = nomeAtracao;
        this.estilo = estilo;
        this.palcoPrincipal = palcoPrincipal;
    }

    public abstract void calcularCache();

    public String getPalcoPrincipal() {
        return palcoPrincipal;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "Artista confirmado no Line-Up: " + nomeAtracao +
                " | Estilo: " + estilo;
    }

}
