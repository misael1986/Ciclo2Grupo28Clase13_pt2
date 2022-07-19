package com.unal.ciclo2grupo28clase13_pt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase13_pt2 {

    public static void main(String[] args) {

        /*
        // Creando una lista de enteros(Integers)
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("Tamaño de la lista:"+lista.size());
        
        // Agregando elementos
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }
        // Imprimiendo elementos
        System.out.println("Tamaño de la lista:"+lista.size());
        System.out.println(lista);
        // Quitando el elemento en la posicion 3
        lista.remove(3);
        // Imprimiendo elarreglo
        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        // Usando el iterador de la lista
        for (Integer n : lista) {
            System.out.print(n + " ");
        }
         */
 /*
        // LinkedListdecadenasdecaracteres
        LinkedList<String> lista = new LinkedList<String>();
        // mecanismosparaagregarelementos
        lista.add("A");
        lista.add("B");
        lista.addLast("C");
        lista.addFirst("D");
        lista.add(2, "E");
        System.out.println("Lista1:" + lista);

        // modificaciondeunelemento
        lista.set(1, "a");
        System.out.println(lista);
        // impresionutilizandociclos
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        // mecanismosparaeliminarelementos
        lista.remove("B");
        lista.remove(3);
        lista.removeFirst();
        lista.removeLast();
        System.out.println("Listafinal:" + lista);
         */
 /*
        // Vectorparaalmacenarcualquiertipo
        Vector vector = new Vector();
        // agregarelementosdedistintotipo
        vector.add(1);
        vector.add(true);
        vector.add("Mision");
        vector.add("TIC");
        vector.add(2);
        System.out.println("Vector1:" + vector);
        // modificarelvalordeunodeloselementos
        vector.set(0, 2021);
        System.out.println("Vector2:" + vector);
        // eliminarelementoenelndice4
        vector.remove(4);
        System.out.println("Vector3:" + vector);
        // impresiondeelementosconcicloporelemento
        for (Object elemento : vector) {
            System.out.print(elemento + ";");
        }
        
        
        
         */
        // HashMapconclavesstringyvaloresdouble
        HashMap<String, Double> mapa = new HashMap<>();
        // agregarelementosalHashMap
        mapa.put("nota1", 3.2);
        mapa.put("nota2", 4.3);
        mapa.put("nota3", 3.9);
        // cantidaddeelementosenelHashMap
        System.out.println("Tama~no:" + mapa.size());
        // impresiondelHashMap
        System.out.println("HashMap1:" + mapa);
        // verificaciondellaveyextracciondevalor
        if (mapa.containsKey("nota2")) {
            Double valor = mapa.get("nota2");
            System.out.println("nota2===" + valor);
        }
        mapa.remove("nota1");
        System.out.println("HashMapFinal:");
        // recorrerHashMapporllaveyclave
        for (Map.Entry<String, Double> elem : mapa.entrySet()) {
            System.out.println(elem.getKey() + ":" + elem.getValue());
        }

        // CreaciondelTreeMap
        TreeMap<Integer, String> mapaT
                = new TreeMap<Integer, String>();
        // Agregarelementos
        mapaT.put(3, "Mision TIC");
        mapaT.put(2, "estudiantes");
        mapaT.put(1, "hola");
        for (Map.Entry pareja : mapaT.entrySet()) {
            int clave = (int) pareja.getKey();
            String valor = (String) pareja.getValue();
            System.out.println(clave + ":" + valor);

        }
    }
}
