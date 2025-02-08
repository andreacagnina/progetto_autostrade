package it.gestione;

public class Percorrenza {
    private Tratta tratta;
    private Autoveicolo autoveicolo;
    private int data;

    public Percorrenza(Tratta tratta, Autoveicolo autoveicolo, int data){
        this.tratta=tratta;
        this.autoveicolo=autoveicolo;
        this.data=data;
    }

    public Tratta getTratta(){return tratta;}
    public Autoveicolo getAutoveicolo(){return autoveicolo;}
    public int getData(){return data;}

    @Override
    public String toString(){
        return "Percorrenza: " + tratta + " auto: " + autoveicolo + " giorno: " + data;
    }
}
