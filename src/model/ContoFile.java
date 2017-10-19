/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Docente
 */
public class ContoFile {

    private final static String PATHNAME = "dati/conto.csv";
    private File f;

    public ContoFile() {
        f = new File(PATHNAME);
    }

    public void scriviDati(Operazione[] dati) {
        try {
            PrintWriter scrittore = new PrintWriter(f);
            for (int i = 0; i < dati.length; i++) {
                String s = dati[i].getData() + ";" + dati[i].getImporto() + ";" + dati[i].getCausale() + ";";
                s = s.replace('.', ',');
                scrittore.println(s);
            }
            scrittore.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Errore in apertura del file");
        }
    }

    public Vector<Operazione> leggiDati() {
        Vector<Operazione> op;
        try {
            Scanner lettore = new Scanner(f);
            lettore.useDelimiter(";");
            //System.out.println("Apertura file corretta");
            op = new Vector<Operazione>();
            while (lettore.hasNext()) {
                Operazione o = new Operazione(lettore.next(), lettore.nextDouble(), lettore.next());
                lettore.nextLine();
                op.add(o);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Errore in apertura file");
            op = null;
        }
        return op;
    }
}
