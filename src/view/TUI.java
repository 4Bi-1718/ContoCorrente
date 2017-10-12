/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
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
        Scanner l = new Scanner(System.in);
        System.out.print("Digitare numero: ");
        int input=l.nextInt();
        if(input>2){
            System.out.println("il numero inserito non è valido,inserire uno dei numeri proposti");
            System.out.println(" ");
        }
        return input;
    }
    
    public void visualizzaSaldo(Conto c){
        System.out.println("Il saldo attuale è: " + c.saldo());
        ordSeparatore();
    }
    
    public void ordSeparatore(){
        System.out.println("-----------------"); //metodo che stampa separatore
    }                                            
}
