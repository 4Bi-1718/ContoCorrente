/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
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

    public Operazione[] leggiDati() {
        Operazione[] op;
        try {
            Scanner lettore = new Scanner(f);
            lettore.useDelimiter(";");
            //System.out.println("Apertura file corretta");
            op = new Operazione[contaRighe()];
            for (int i = 0; i < op.length; i++) {
                //leggi la riga
                String data = lettore.next();
                System.out.print("data:" + data);
                double importo = lettore.nextDouble();
                System.out.print(", importo:" + importo);
                String causale = lettore.next();
                System.out.println(", causale:" + causale);
                lettore.nextLine();
                //con i dati letti istanzio oggetto Operazione
                Operazione o = new Operazione(data, importo, causale);
                //assegno l'oggetto al dato di indice i nell'array
                op[i] = o;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Errore in apertura file");
            op = null;
        }
        return op;
    }

    public int contaRighe() {
        try {
            int conta = 0;
            Scanner l = new Scanner(f);
            while (l.hasNext()) {
                l.nextLine();
                conta++;
            }
            return conta;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ContoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
