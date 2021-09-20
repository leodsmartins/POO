package Checkpoint;

public class Nacional extends Atracao implements PagarBonusMaster, PagarBonus{
    private double valorCache;
    private String PalcoApoio;

    public Nacional(String nomeAtracao, String estilo, String palcoPrincipal, double valorCache, String palcoApoio) {
        super(nomeAtracao, estilo, palcoPrincipal);
        this.valorCache = valorCache;
        PalcoApoio = palcoApoio;
    }

    @Override
    public void calcularCache() {
        if(this.PalcoApoio.equals("sim") && getPalcoPrincipal().equals("não")){
            this.valorCache = pagarBonus();
            System.out.println("O cachê de " + getNomeAtracao() + " é: R$ " + this.valorCache);
        }
        else if(this.PalcoApoio.equals("sim") && getPalcoPrincipal().equals("sim")){
            this.valorCache = (pagarBonus()-this.valorCache) + (pagarBonusMain()-this.valorCache) + this.valorCache;
            System.out.println("O cachê de " + getNomeAtracao() + " é: R$ " + this.valorCache);
        }
        else if(this.PalcoApoio.equals("não") && getPalcoPrincipal().equals("sim")){
            this.valorCache = pagarBonusMain();
            System.out.println("O cachê de " + getNomeAtracao() + " é: R$ " + this.valorCache);
        }
        else{
            System.out.println("Em negociação");
        }

    }

    @Override
    public double pagarBonus() {
        this.valorCache += 10000;
        return this.valorCache;
    }

    @Override
    public double pagarBonusMain() {
        this.valorCache += 50000;
        return this.valorCache;
    }
}
