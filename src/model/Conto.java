/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Docente
 */
public class Conto {

    private ContoFile cf;
    private Operazione[] dati;

    public Conto() {
        cf = new ContoFile();
        dati = cf.leggiDati();
    }
    
    public void registraOperazione(Operazione op){
        //istanza nuovo array +1 rispetto all'esistente
        Operazione[] dati2 = new Operazione[dati.length + 1];
        //copio tutti i dati nel nuovo array
        for (int i = 0; i < dati.length; i++) {
            dati2[i] = dati[i];
        }
        //assegno op all'ultimo posto dell'array nuovo
        dati2[dati2.length - 1] = op;
        //assegno il nuovo array a dati
        dati = dati2;
        cf.scriviDati(dati);
    }

}
