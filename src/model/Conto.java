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
        cf=new ContoFile();
        dati=cf.leggiDati();
    }
    
    
}
