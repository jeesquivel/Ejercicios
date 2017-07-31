/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeison
 */
public class Ejercicio {


    /**
     *  Determina si se cumple la desiguada triangular en un triangulo.
     * @param a lado de un triangulo
     * @param b lado de un triangulo
     * @param c lado de un triangulo
     * @return  True or False
     */
    public boolean CumpleDesTriangular(int a, int b, int c){
        if(a<b+c & b<a+c & c<a+b)
            return true;
        return false;
    }



    /**
     *  Determina el tipo de triangulo (escaleno, isosceles, equilatero)
     * @param num1 lado de un triangulo
     * @param num2 lado de un triangulo
     * @param num3 lado de un triangulo
     * @return
     */
    public String ejercicios1(int num1, int num2, int num3){
        if (num1==num2 & num2==num3)
            return "equlatero";
        else{
            if (num1==num2 || num2==num1 || num1== num3)
                return "isósceles";
            return "escaleno";
        }
    }


    /**
     *  Determina el area de un triangulo.
     * @param a lado de un triangulo
     * @param b lado de un triangulo
     * @param c lado de un triangulo
     * @return
     */
    public String areaTriangulo(int a, int b , int c){
        if (CumpleDesTriangular(a,b,c)) {
            double s = (double) (a + b + c) / 2;
            return "Area es de: "+(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
        return "no se cumple desigualdad trtiangular";

    }


    /**
     *  etermina si un numero es par o no
     * @param a un numero natural
     * @return true si el a es par
     */
    public boolean esPar(int a){
        if (a%2==0)
            return  true;
        return false;
    }

    /**
     * Determina el producto de dos numeros por sumas sucesivas;
     * @param a factor
     * @param b factor
     * @return el producto de dos numeros
     */

    public int pordcutoSumasSucesivas(int a, int b){
        int res=a;
        for (int i = 1; i < b ; i++) {
            res+=a;
        }
            return  res;
    }

    /**
     * retorna  el factorial de un numero de manera iterativa
     * @param a  entero
     * @return
     */
    public int factorial_secesivo(int a){
        int res=a;
        while (a!=1){
            a=(a-1);
            res*=a;
        }
        return res;
    }

    /**
     *  Factorial recursivo por pila de un numero
     * @param a entero
     * @return
     */
    public  int factorialRecursivo(int a){
        if (a==1 || a==0) return 1;
        return a*factorialRecursivo(a-1);
    }

    /**
     *  Factorial recursivo por cola de un numero
     * @param num entero
     * @return
     */
    public int factorialRecursivoCola(int num, int res){
        if (num == 1 || num == 0) return res;
        return (factorialRecursivoCola(num-1,res*num));
    }

    /**
     * retona el Fibonacci de un numero
     * @param n entero
     * @return
     */

    public  int fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }


    /**
     * imprime los primeros numeros de la serie de fibonacci antes de un numero dado
     * @param n numero
     */

    public void primerosFib(int n){
        int x=0;
        int y=1;
        int suma=0;
        while(suma<n){
            suma=x+y;
            y=x;
            x=suma;
            System.out.print(suma+"-");
        }
    }

    /**
     * retorna una lista copn los divisores de un numero
     * @param n un natural
     * @return
     */
    public List divisores(int n){
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                lista.add(i);
            }
        }
        return  lista;

    }

    /**
     * Determina si un numero es primo o no
     * @param  n  numero natural
     * @return
     */
    public  Boolean esPrimo(int n){
        for (int i = 2; i <n/2 ; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        Ejercicio ejemplo= new Ejercicio();
        System.out.print(ejemplo.esPrimo(91));



    }
    
}
