package org.example;

public class ArbolBinario {
    private NodoBinario<String> raiz;

    public ArbolBinario(){
        raiz = null;
    }

    public ArbolBinario(String objetoRaiz){
        raiz = new NodoBinario<String>(objetoRaiz, null, null);
    }
}
