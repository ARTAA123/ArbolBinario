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
        if(t == null)
            return 0;
        else
            return 1 + tamano(t.izquierdo) + tamano(t.derecho);
    }

    public static int altura(NodoBinario<String> t){
        if(t == null)
            return -1;
        else
            return 1 + Math.max(altura(t.izquierdo), altura(t.derecho));
    }

    public NodoBinario<String> duplicar(){

        NodoBinario<String> raiz = new NodoBinario<String>(element, null, null);
        if(izquierdo != null)
            raiz.izquierdo = izquierdo.duplicar();
        if(derecho != null)
            raiz.derecho = derecho.duplicar();
        return raiz;
    }

    //Imprimir los arboles binarios
    public void printPreOrden(){
        System.out.println(element);
        if(izquierdo != null)
             izquierdo.printPreOrden();
        if(derecho != null)
            derecho.printPreOrden();
    }

    public void printPostOrden(){

        if(izquierdo != null)
            izquierdo.printPostOrden();
        if(derecho != null)
            derecho.printPostOrden();
        System.out.println(element);
    }

    public void printInOrden(){
        if(izquierdo != null)
            izquierdo.printInOrden();
        System.out.println(element);
        if(derecho != null)
            derecho.printInOrden();
    }
}
