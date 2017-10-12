/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Conto;

/**
 *
 * @author Docente
 */
public class TUI {

    public void scriviTitolo() {
        System.out.println("Gestione di conto corrente");
    }

    public void presentaMenu() {
        System.out.println("1 - visualizza la lista");
        System.out.println("2 - aggiungi operazione");
        System.out.println("0 - chiudi il programma");
    }

    public int inputScelta() {
        return 0;
    }
    
    public void visualizzaSaldo(Conto c){
        System.out.println("Il saldo attuale è: " + c.saldo());
    }
}
