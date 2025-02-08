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

        for(Autoveicolo a : this.autoveicoli){
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

    public Autoveicolo trovaAutoFrequente(int d1, int d2){
        Map<Autoveicolo, Integer> conteggio = new HashMap<>();

        for(Percorrenza p : percorrenze){
            if(p.getData() >= d1 && p.getData()<= d2){
                conteggio.put(p.getAutoveicolo(), conteggio.getOrDefault(p.getAutoveicolo(),0) + 1);
            }
        }

        Autoveicolo autoMax = null;
        int maxPercorrenze = 0;

        for(Map.Entry<Autoveicolo, Integer> entry : conteggio.entrySet()){
            if(entry.getValue() > maxPercorrenze){
                maxPercorrenze = entry.getValue();
                autoMax = entry.getKey();
            }
        }
    return autoMax;
    }

    public ArrayList<Citta> cittaGettonate(){
        Map<Citta, Integer> conteggio = new HashMap<>();

    for(Percorrenza p : percorrenze){
    conteggio.put(p.getTratta().getCittaArrivo(), conteggio.getOrDefault(p.getTratta().getCittaArrivo(), 0)+1);
}
List<Map.Entry<Citta, Integer>> list = new ArrayList<>(conteggio.entrySet());
list.sort((entry1, entry2)-> entry2.getValue() - entry1.getValue());
ArrayList<Citta> risultato = new ArrayList<>();
for(Map.Entry<Citta, Integer> entry : list){
risultato.add(entry.getKey());
}return risultato;
}
}
