package org.example;

import org.apache.tomcat.util.digester.ArrayStack;

import java.util.NoSuchElementException;
import java.util.Stack;

class PostOrden<S> extends IteradorArbol<S>{

    protected Stack<StNodo<String>> s;

    protected static class StNodo<String>{
        StNodo(NodoBinario<String> n){nodo = n;
            vecesAparece = 0;
        }
        NodoBinario<String> nodo;
        int vecesAparece;
    }


    public PostOrden(ArbolBinario<String> arbol) {
        super(arbol);
        s = new Stack<StNodo<String>>();
        s.push(new StNodo<String>(t.obtenerRaiz()));

    }

    @Override
    public void primero() {
        s.empty();
        if(t.obtenerRaiz() != null){
            s.push(new StNodo<String>(t.obtenerRaiz()));
            avanzar();
        }
    }

    @Override
    public void avanzar() {
        if(s.isEmpty()){
            if(actual ==null)
                throw new NoSuchElementException();
            actual = null;
            return;
        }

        StNodo<String> cnodo;

        for( ; ; ){
            cnodo = s.pop();

            if(++cnodo.vecesAparece == 3){
                actual =cnodo.nodo;
                return;
            }

            s.push(cnodo);

            if (cnodo.vecesAparece == 1){
                if(cnodo.nodo.getIzquierdo() != null)
                    s.push(new StNodo<String>(cnodo.nodo.getIzquierdo()));
            }
            else{
                if(cnodo.nodo.getDerecho() != null){
                    s.push(new StNodo<String>(cnodo.nodo.getDerecho()));
                }
            }
        }
    }
}
