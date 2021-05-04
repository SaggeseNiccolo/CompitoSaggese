package com.mycompany.compitosaggese;

import static java.lang.Thread.*;
import java.util.concurrent.*;

/**
 * Questa classe rappresenta una risorsa che deve essere assegnata ai thread
 * uomo
 *
 * @author informatica
 */
public class BagnoUomini {

    private final Semaphore s = new Semaphore(1);

    public BagnoUomini() {
    }

    public void utilizza(Uomo u) throws InterruptedException {
        s.acquire();
        System.out.println(u.getNome() + " è entrato nel bagno degli uomini");

        //Generazione casuale del tempo di utilizzo del bagno
        int random = ((int) Math.floor(Math.random() * (10 - 1 + 1) + 1)) * 1000;
        sleep(random);

        System.out.println(u.getNome() + " è uscito dal bagno degli uomini dopo " + random / 1000 + " secondi");
        s.release();
    }

}
