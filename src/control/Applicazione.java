/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;
import view.TUI;

/**
 *
 * @author Docente
 */
public class Applicazione {

    private TUI v;
    private Conto c;

    public Applicazione() {
        v = new TUI();
        c = new Conto();
    }

    public void run() {
        v.ordSeparatore();

        v.scriviTitolo();
        v.ordSeparatore();
        int scelta;
        do {
            //presenta il menu
            v.presentaMenu();
            v.ordSeparatore();
            //input scelta
            scelta = v.inputScelta();
            switch (scelta) {
                case 1:
                    //mostra la lista
                    listaOperazioni();
                    //visualizza saldo
                    v.visualizzaSaldo(c);
                    break;
                case 2:
                    //aggiungi movimento
                    aggiungiOperazione();
                    break;
                case 0:
                    //chiudi programma
                    chiudi();
                    break;
                default:
                    //non ammissibile
                    sceltaNonAmmissibile();
                    break;
            }
        } while (scelta != 0);
    }

    private void listaOperazioni() {
        v.visualizzaLista(c.iteratore());
    }

    private void aggiungiOperazione() {
        Operazione o = v.inputOperazione();
        c.registraOperazione(o);
    }

    private void chiudi() {

    }

    private void sceltaNonAmmissibile() {

    }
}
