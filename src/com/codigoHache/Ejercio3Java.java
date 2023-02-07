package com.codigoHache;

public class Ejercio3Java {
    public static void main(String[] args) {
      String nombre = "Juan";
        int edad = 25;
        String ciudad = "Madrid";

        String informacion = nombre + " " + edad + " años" + " " + ciudad;
        System.out.println(informacion);

        System.out.println();

        String cliente = "Manolo";
        String cliente2 = "Leonardo";
        String cliente3 = "Juan";
        System.out.println(cliente + " " + cliente2 + " " + cliente3);


        System.out.println();

        String[] nombres = {"Pedro", "Manuel", "Juan"};
        for (String s : nombres ) {
            System.out.print(s + " ");
        }
        System.out.println();
        int suma = 0;

        String[] personas = {"Pedro", "Raul", "Juan"};
        for (int i = 0; i < personas.length; i++) {
            suma += personas[i].length();
            System.out.print(personas[i]+ " ");
        }











        }






    }






