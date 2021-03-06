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
        dati = cf.leggiDati();
    }

    public Iterator iteratore() {
        return dati.iterator();
    }

    public void registraOperazione(Operazione op) {
        dati.add(op);
        cf.scriviDati(dati.iterator());
    }

    public double saldo() {
        double saldo = 0;
        Iterator<Operazione> it = dati.iterator();
        Operazione op;

        while (it.hasNext()) {
            op = it.next();
            saldo += op.getImporto();
        }
        return saldo;
    }
}
