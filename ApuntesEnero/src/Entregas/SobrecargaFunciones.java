package Entregas;

public class SobrecargaFunciones {


    /*
    *Ejercicio 1: Sobrecarga de Funciones para Media, Moda y Mediana.
    *Descripción: Crea un programa que implemente una función sobrecargada llamada "calcular" 
    *que realice las siguientes operaciones dependiendo del tipo de parámetro recibido:

    *Media (int[]): Calcula la media de un arreglo de números enteros.
    *Moda (double[]): Encuentra el valor más frecuente en un arreglo de números decimales.
    *Mediana (String[]): Determina la mediana (orden alfabético) de un arreglo de cadenas.
    *Requisitos:

    *Implementa tres versiones de la función "calcular" para manejar enteros, decimales y cadenas.
    *Muestra ejemplos para cada caso. 
    */

    public static void main (String[] args) {
      System.out.println("Esta es la media: " + calcular(1, 2, 3, 4, 5));
      System.out.println("Esta es la moda: " + calcular(1.1, 2.2, 3.3, 4.4, 5.5, 1.1, 1.1));
      System.out.println("Esta es la mediana: " + calcular("Zorro", "Perro", "Gato", "Abeja", "Vaca"));
    }
    public static int calcular(int... numeros) {
        int media = 0;
        for (int numero : numeros) {
            media += numero;
        }
        return media / numeros.length;
    }
    



    public static double calcular(double... numeros) {
        double moda = 0;
        int maximo = 0;
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
            if (contador > maximo) {
                moda = numeros[i];
                maximo = contador;
            }
        }
        return moda;
    }
    
    
    public static String calcular(String... cadenas) {
        String mediana = "";
        for (int i = 0; i < cadenas.length; i++) {
            for (int j = i + 1; j < cadenas.length; j++) {
                if (cadenas[i].compareTo(cadenas[j]) > 0) {
                    String aux = cadenas[i];
                    cadenas[i] = cadenas[j];
                    cadenas[j] = aux;
                }
            }
        }
        if (cadenas.length % 2 == 0) {
            mediana = cadenas[cadenas.length / 2 - 1] + ", " + cadenas[cadenas.length / 2];
        } else {
            mediana = cadenas[cadenas.length / 2];
        }
        return mediana;
    }   
}


/*
Commit: Guarda cambios en tu repositorio local.
Push: Sube esos cambios locales al repositorio remoto.
Pull: Trae los cambios del repositorio remoto hacia tu repositorio local.
*/
