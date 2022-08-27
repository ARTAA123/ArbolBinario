package org.example;

import java.util.NoSuchElementException;
import java.util.Stack;

class PreOrden extends IteradorArbol{

    private Stack<NodoBinario<String>> s;
    public PreOrden(ArbolBinario arbol) {
        super(arbol);
        s = new Stack<NodoBinario<String>>();
        s.push(t.obtenerRaiz());
    }

    @Override
    public void primero() {
        s.clear();
        if(t.obtenerRaiz() != null){
            s.push(t.obtenerRaiz());
            avanzar();
        }
    }

    @Override
    public void avanzar() {
        if(s.isEmpty()){
            if (actual == null)
                throw new NoSuchElementException();
                actual = null;
                return;

        }

        actual = s.pop();

        if(actual.getDerecho() != null){
            s.push(actual.getDerecho());
        }

        if(actual.getIzquierdo() != null){
            s.push(actual.getIzquierdo());
        }
    }
}
