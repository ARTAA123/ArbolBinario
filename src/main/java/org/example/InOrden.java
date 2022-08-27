package org.example;

import java.util.NoSuchElementException;

class InOrden<String> extends PostOrden<String> {


    public InOrden(ArbolBinario<java.lang.String> arbol) {
        super(arbol);
    }

    public void avanzar(){
        if(s.isEmpty()) {
            if (actual == null)
                throw new NoSuchElementException();
            actual = null;
            return;
        }

        StNodo<java.lang.String> cnodo;

        for( ; ; ){
            cnodo = s.pop();

            if(++cnodo.vecesAparece == 2){
                actual = cnodo.nodo;
                if (cnodo.nodo.getDerecho() != null){
                    s.push(new StNodo<>(cnodo.nodo.getDerecho()));
                    return;
                }
                s.push(cnodo);
                if (cnodo.nodo.getIzquierdo() != null){
                    s.push(new StNodo<>(cnodo.nodo.getIzquierdo()));
                }
            }
        }
    }


}
