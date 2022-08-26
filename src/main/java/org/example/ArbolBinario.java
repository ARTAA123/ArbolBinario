package org.example;

public class ArbolBinario<S> {
    private NodoBinario<String> raiz;

    public ArbolBinario(){
        raiz = null;
    }

    public ArbolBinario(String objetoRaiz){
        raiz = new NodoBinario<String>(objetoRaiz, null, null);
    }

    public NodoBinario<String> obtenerRaiz(){
        return raiz;
    }

    public int tamano(){
        return NodoBinario.tamano(raiz);
    }

    public int altura(){
        return NodoBinario.altura(raiz);
    }

    public void imprimirEnPreorden(){
        {
            if (raiz != null) {
                raiz.printPreOrden();
            }
        }
    }

    public void imprimirInOrden(){
        {
            if (raiz != null) {
                raiz.printInOrden();
            }
        }
    }

    public void imprimirEnPostrden(){
        {
            if (raiz != null) {
                raiz.printPostOrden();
            }
        }
    }

    public void vaciar(){
        raiz = null;
    }

    public boolean estaVacio(){
        return raiz == null;
    }

    public void unir(String objetoRaiz, ArbolBinario<S> t1, ArbolBinario<String> t2){
        if(t1.raiz==t2.raiz && t1.raiz != null){
            throw new IllegalArgumentException();
        }

        //Asignar nuevo nodo
        raiz = new NodoBinario<>(objetoRaiz, t1.raiz, t2.raiz);

        if(this != t1)
            t1.raiz = null;

        if(this != t2)
            t2.raiz = null;
    }


}

