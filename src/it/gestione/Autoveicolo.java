package it.gestione;

public class Autoveicolo {
    private String targa;
    private String marca;
    private int cilindrata;

    public Autoveicolo(String targa, String marca, int cilindrata){
        this.targa=targa;
        this.marca=marca;
        this.cilindrata=cilindrata;
    }

    public String getTarga(){
        return targa;
    }

    public String toString(){
        return "marca: " + marca + " cc: " + cilindrata + " targata: " + targa;
    }

}
