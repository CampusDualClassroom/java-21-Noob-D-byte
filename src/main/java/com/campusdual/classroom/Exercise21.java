package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        //Crear una colección de tipo Set e inicializarla como HashSet en el metodo createHashSet().

        Set<String> hashSet = new HashSet<>();

        // Luego poblar el conjunto con elementos y devolver el HashSet construído.

        hashSet.add("ELEMENT KPRBC");
        hashSet.add("ELEMENT YPBTM");
        hashSet.add("ELEMENT AADXU");
        hashSet.add("ELEMENT RXCGJ");
        hashSet.add("ELEMENT WYMVD");
        hashSet.add("ELEMENT WFGEJ");
        hashSet.add("ELEMENT TYGBS");
        hashSet.add("ELEMENT MAPTK");
        hashSet.add("ELEMENT GJXVE");
        hashSet.add("ELEMENT BAFGL");
        return hashSet;
    }

    public static Set<String> createTreeSet() {
        //Realizar el proceso análogo como TreeSet en el metodo createTreeSet()

        //Crear una colección de tipo Set e inicializarla como treeSet en el metodo createTreeSet().
        Set<String> treeSet = new TreeSet<>();

        // Luego poblar el conjunto con elementos y devolver el treeSet construído.

        treeSet.add("ELEMENT KPRBC");
        treeSet.add("ELEMENT YPBTM");
        treeSet.add("ELEMENT AADXU");
        treeSet.add("ELEMENT RXCGJ");
        treeSet.add("ELEMENT WYMVD");
        treeSet.add("ELEMENT WFGEJ");
        treeSet.add("ELEMENT TYGBS");
        treeSet.add("ELEMENT MAPTK");
        treeSet.add("ELEMENT GJXVE");
        treeSet.add("ELEMENT BAFGL");

        return treeSet;


    }

    private static void printSet(Set<String> customSet) {
//Recorrer cada conjunto usando el metodo printSet() mostrando por pantalla el valor de cada elemento.
        for (String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        /*Nice to have

        if (set.add(elementToAdd)) {
            System.out.println("Se ha agregado el elemento. ");
            return true;
        } else {
            System.out.println("No se ha podido agregar el elemento. ");
            return false;
        }*/

        //Añadir un elemento más a cada conjunto usando el metodo addElementToSet()
        // y devolver el booleano resultante de la operación.
        return set.add(elementToAdd);
        //devolve true si o elemento foi añadido correctamente
    }

    public static void main(String[] args) {

        //Creamos e poblamos o hashSet
        Set<String> hashSet = createHashSet();

        //Creamos e poblamos o treeSet
        Set<String> treeSet = createTreeSet();

        //Añadimos o "ELEMENT AAA" a cada colección
        boolean addedToHashSet = addElementToSet(hashSet, "ELEMENT AAA");

        boolean addedToTreeSet = addElementToSet(treeSet, "ELEMENT AAA");


        System.out.println("hashSet");
        printSet(hashSet);
        System.out.println("\n Elemento añadido al hashSet: " + addedToHashSet);

        System.out.println("\n treeSet");
        printSet(treeSet);
        System.out.println("\n Elemento añadido al treeSet: " + addedToTreeSet);
    }
//O hashSet non mantén orden específico, mnetres que o treeSet mantén un orden alfabético cando en ambos se añaden elementos.
}
