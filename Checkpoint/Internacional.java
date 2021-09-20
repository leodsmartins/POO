package Checkpoint;

public class Internacional extends Atracao implements PagarBonus {
    private double valorCache;
    private double despesasViagem;

    public Internacional(String nomeAtracao, String estilo, String palcoPrincipal, double valorCache, double despesasViagem) {
        super(nomeAtracao, estilo, palcoPrincipal);
        this.valorCache = valorCache;
        this.despesasViagem = despesasViagem;
    }

    @Override
    public void calcularCache() {
        if(this.getPalcoPrincipal().equals("sim")){
            this.valorCache = pagarBonus() + this.despesasViagem;
            System.out.println("O cachê de " + getNomeAtracao() + " é: R$ " + this.valorCache);
        }
        else{
            System.out.println("Em negociação");
        }
    }

    @Override
    public double pagarBonus() {
        this.valorCache += 50000;
        return this.valorCache;
    }
}
