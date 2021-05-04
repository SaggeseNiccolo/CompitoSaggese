package com.mycompany.compitosaggese;

import static java.lang.Thread.*;
import java.util.concurrent.*;

/**
 *
 * @author informatica
 */
public class BagnoDonne {

    private final Semaphore s = new Semaphore(1);

    public BagnoDonne() {}

    public void utilizza(Donna d) throws InterruptedException {
        s.acquire();
        System.out.println(d.getNome() + " è entrata nel bagno delle donne");

        //Generazione casuale del tempo di utilizzo del bagno
        int random = ((int) Math.floor(Math.random() * (10 - 1 + 1) + 1)) * 1000;
        sleep(random);

        System.out.println(d.getNome() + " è uscita dal bagno delle donne dopo " + random / 1000 + " secondi");
        s.release();
    }

}
