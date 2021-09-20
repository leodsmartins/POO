package Checkpoint;

public class Main {
    public static void main(String[] args) {

        //Instanciação das classes:
        FestivalMusica festival1 = new FestivalMusica("Lollapalooza");
        Atracao atracao1 = new Nacional ("Silva", "Alternativo", "sim", 50000, "não");
        Atracao atracao2 = new Nacional ("Duda Beat", "Pop", "sim", 100000, "sim");
        Atracao atracao3 = new Internacional("Bruno Mars", "Pop", "sim", 300000, 100000);
        Atracao atracao4 = new Internacional("Posto Malone", "Hip-Hop", "sim", 250000, 70000);
        Atracao atracao5 = new Nacional ("Seu Jorge", "Pop", "não", 50000, "sim");


        //Implementação dos métodos:
        atracao1.calcularCache();
        festival1.contratar(atracao1);

        atracao2.calcularCache();
        festival1.contratar(atracao2);

        atracao3.calcularCache();
        festival1.contratar(atracao3);

        atracao4.calcularCache();
        festival1.contratar(atracao4);


        atracao5.calcularCache();
        festival1.contratar(atracao5);

        festival1.exibirNomeFest();
        festival1.gerarLineUp();
    }

}

