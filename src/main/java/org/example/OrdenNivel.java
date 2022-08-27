package org.example;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

class OrdenNivel<String> extends IteradorArbol<String> {

    private Queue<NodoBinario<String>> q;
    
    public OrdenNivel(ArbolBinario<java.lang.String> arbol) {
        super(arbol);
        q = new ArrayDeque<NodoBinario<String>>();
        q.add((NodoBinario<String>) t.obtenerRaiz());

    }

    @Override
    public void primero() {
        q.clear();
        if(t.obtenerRaiz() != null){
            q.add((NodoBinario<String>) t.obtenerRaiz());
            avanzar();
        }
    }

    @Override
    public void avanzar() {
        if(q.isEmpty()){
            if(actual ==null)
                throw new NoSuchElementException();
            actual = null;
            return;
        }

        actual = (NodoBinario<java.lang.String>) q.element();

        if(actual.getIzquierdo() != null){
            q.add((NodoBinario<String>) actual.getIzquierdo());
        }

        if(actual.getDerecho() != null){
            q.add((NodoBinario<String>) actual.getDerecho());
        }
    }
}
