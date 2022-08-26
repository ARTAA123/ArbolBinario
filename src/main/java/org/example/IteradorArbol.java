package org.example;

import java.util.NoSuchElementException;

abstract class IteradorArbol<S> {

    protected ArbolBinario<String> t;
    protected NodoBinario<String> actual;

    public IteradorArbol(ArbolBinario<String> arbol){
        t= arbol;
        actual = null;
    }

    final public boolean esValido(){
        return actual!= null;
    }

    final public String recuperar(){
        if(actual == null)
            throw new NoSuchElementException();
        return actual.getElement();
    }

    abstract public void primero();
    abstract public void avanzar();


}
