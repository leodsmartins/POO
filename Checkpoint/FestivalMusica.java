package Checkpoint;

import java.util.ArrayList;

public class FestivalMusica {
    private String nomeFestival;
    private ArrayList<Atracao> listaAtracoes = new ArrayList<>();

    public FestivalMusica(String nomeFestival) {
        this.nomeFestival = nomeFestival;
    }

    public void contratar(Atracao atracao){
        listaAtracoes.add(atracao);
        System.out.println("Atração contratada!");
    }

    public void exibirNomeFest(){
        System.out.println("Nome do festival:" + nomeFestival);
    }

    public void gerarLineUp(){
        for(int i = 0; i < listaAtracoes.size(); i++){
            System.out.println(listaAtracoes.get(i));
        }
    }

}
