package Entregas;

import java.util.Scanner;

public class CombinacionesRecursivas {

    /*Ejercicio 2: Combinaciones de n elementos tomados de k en k.
    *Descripción: Escribe un programa que calcule las combinaciones posibles de n elementos tomados de k
    *en k utilizando recursividad. Una combinación es un subconjunto de tamaño k extraído de un conjunto den elementos.
    *Fórmula de combinaciones:
    *Requisitos
    *El usuario debe ingresar n (el tamaño del conjunto) y k (el tamaño del subconjunto).
    *Usa recursividad para calcular el número total de combinaciones.
    *Muestra el número total de combinaciones posibles.
    */


public static void main(String[] args) {
    
   Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de elementos (n): ");
        int n = scanner.nextInt();

        System.out.print("Introduce el numero de elementos a tomar (k): ");
        int k = scanner.nextInt();
        
        scanner.close();

        if (n < k) {
            System.out.println("El tamaño del conjunto debe ser mayor o igual al tamaño del subconjunto.");
        }
        else if (n < 0 || k < 0) {
            System.out.println("El tamaño del conjunto y del subconjunto deben ser mayores o iguales a 0.");
        }
        else {
            System.out.println("El número total de combinaciones posibles de " + n + " elementos tomados de " + k + " en " + k + " es: " + combinaciones(n, k));
        }
    }

    public static int combinaciones(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return combinaciones(n - 1, k - 1) + combinaciones(n - 1, k);
        }
    }

}
