package org.example;

public class NodoBinario<S> {
    private String element;
    private NodoBinario<String> izquierdo;
    private NodoBinario<String> derecho;


    //Contructores
    public NodoBinario(){
        this(null, null, null);
    }
    public NodoBinario(String elemento, NodoBinario<String> izq,NodoBinario<String> der){
        element = elemento;
        izquierdo = izq;
        derecho = der;

    }


    //Métodos accesores y mutadores
    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public NodoBinario<String> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBinario<String> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoBinario<String> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBinario<String> derecho) {
        this.derecho = derecho;
    }

    //Métodos para obtener datos del arbol
    public static int tamano(NodoBinario<String> t){

        return 0;
    }

    public static int altura(NodoBinario<String> t){

        return 0;
    }

    public NodoBinario<String> duplicar(){

        return null;
    }

    //Imprimir los arboles binarios
    public void printPreOrden(){

    }

    public void printPostOrden(){

    }

    public void printInOrden(){

    }
}
