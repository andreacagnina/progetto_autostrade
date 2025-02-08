package it.gestione;

import java.util.*;

public class GestioneReteAs {
    private List<Citta> citta = new ArrayList<>();
    private List<Tratta> tratte = new ArrayList<>();
    private List<Autoveicolo> autoveicoli = new ArrayList<>();
    private List<Percorrenza> percorrenze = new ArrayList<>();

    public void aggiungiCitta(Citta c){
        citta.add(c);
    }
    public void aggiungiTratta(Tratta t){
        tratte.add(t);
    }
    public void aggiungiAutoveicolo(Autoveicolo a){
        autoveicoli.add(a);
    }
    public void aggiungiPercorrenza(Percorrenza p){
        percorrenze.add(p);
    }

    public int accessi(Citta c){
        int count = 0;

        for(Percorrenza p : percorrenze){
            if(p.getTratta().getCittaArrivo().equals(c)){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Autoveicolo> trovaAutoveicoli(int x){
        ArrayList<Autoveicolo> autoveicoli = new ArrayList<>();

        for(Autoveicolo a : autoveicoli){
            boolean menoDiXKm= true;
            
            for(Percorrenza p : percorrenze){
                if(p.getAutoveicolo().equals(a) && p.getTratta().getDistanza() > x ){
                    menoDiXKm = false;
                    break;
                }
                } if(menoDiXKm){
                    autoveicoli.add(a);
                }
            } return autoveicoli;
            }
}
