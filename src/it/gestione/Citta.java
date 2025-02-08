package it.gestione;

public class Citta {
    private String nome;
    private String provincia;
    private String regione;

    public Citta(String nome, String provincia, String regione){
        this.nome=nome;
        this.provincia=provincia;
        this.regione=regione;
    }

    public String getNome(){return nome;}
    public String getProvincia(){return provincia;}
    public String getRegione(){return regione;}

    @Override
    public String toString(){
        return nome + " in provincia di " + provincia + " in " + regione;
    }
}
