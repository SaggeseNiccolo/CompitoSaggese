package com.mycompany.compitosaggese;

import java.util.logging.*;

/**
 * Questa classe rappresenta un thread che ha bisogno della risorsa BagnoUomini
 *
 * @author informatica
 */
public class Uomo implements Runnable {

    private final String nome;
    private final BagnoUomini b;

    public Uomo(String nome, BagnoUomini b) {
        this.nome = nome;
        this.b = b;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        try {
            b.utilizza(this);
        } catch (InterruptedException ex) {
            Logger.getLogger(Uomo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
