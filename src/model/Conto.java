/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Docente
 */
public class Conto {

    private ContoFile cf;
    private Vector<Operazione> dati;

    public Conto() {
        cf = new ContoFile();
        dati = new Vector<Operazione>(cf.leggiDati().size());
    }
    
    public Iterator iteratore(){
        return dati.iterator();
    }
    
    public void registraOperazione(Operazione op) {
        dati.add(op);
        //cf.scriviDati(dati);
    }
/*
    public double saldo() {
        double saldo = 0;
        for (int i = 0; i < dati.length; i++) {
            //somma algebrica tra il saldo e l'importo dell'elemento nella posizione i di dati[]
            saldo = saldo + dati[i].getImporto();
        }
        return saldo;
    }
    */
}
