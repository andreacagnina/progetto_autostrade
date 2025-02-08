package it.gestione;

public class Tratta {
    private String codice;
    private String nome;
    private Citta cittaPartenza;
    private Citta cittaArrivo;
    private double distanza;

    public Tratta(String codice, String nome, Citta cittaPartenza, Citta cittaArrivo, double distanza){
        this.codice=codice;
        this.nome=nome;
        this.cittaPartenza=cittaPartenza;
        this.cittaArrivo=cittaArrivo;
        this.distanza=distanza;
    }

    public Citta getCittaArrivo(){return cittaArrivo;}
    public double getDistanza(){return distanza;}

}
