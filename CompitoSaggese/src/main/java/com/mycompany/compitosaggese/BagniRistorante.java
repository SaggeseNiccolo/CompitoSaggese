package com.mycompany.compitosaggese;

/**
 * Questa classe rappresenta la gestione degli ingressi nei bagni di un
 * ristorante che vengono gestiti da un semaforo per ogni bagno
 *
 * @author informatica
 */
public class BagniRistorante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BagnoUomini bUomini = new BagnoUomini();
        BagnoDonne bDonne = new BagnoDonne();

        Thread t1 = new Thread(new Uomo("u1", bUomini));
        Thread t2 = new Thread(new Uomo("u2", bUomini));
        Thread t3 = new Thread(new Uomo("u3", bUomini));
        Thread t4 = new Thread(new Uomo("u4", bUomini));
        Thread t5 = new Thread(new Donna("d1", bDonne));
        Thread t6 = new Thread(new Donna("d2", bDonne));
        Thread t7 = new Thread(new Donna("d3", bDonne));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }

}
