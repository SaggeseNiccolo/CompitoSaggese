package com.mycompany.compitosaggese;

import java.util.logging.*;

/**
 * Questa classe rappresenta un thread che ha bisogno della risorsa BagnoDonne
 *
 * @author informatica
 */
public class Donna implements Runnable {

    private final String nome;
    private final BagnoDonne b;

    public Donna(String nome, BagnoDonne b) {
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
            Logger.getLogger(Donna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
