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
            if (num1==num2 || num2==num3 || num1== num3)
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




    /**
     *  Verifica si un año es bisciesto o no
     * @param anno
     * @return  valor boleano
     */
    public boolean  annoBisciesto(int anno){
        return ( anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0);
    }



    /**
     *  retorna la cantidad de digitos de un digito
     * @param n un entero positivo
     * @return  la cantidad de digitos del nuemro
     */
    public int contarDigitos(int n){
        int cont = 0;
        while (n>9) {
            n=n/10;
            cont++;
        }
        return cont+1;
    }


    /**
     * Invierte un numero dado
     * @param n un entero
     * @return un numero invertido con respeto al valor de entrada
     */
    public  int numeroInvertido (int n){
        int num=0;
        while(n>9){
            num=(int) (num*10+n%10);
            n= n/10;
        }
        return num*10+n;
    }



    /**
     * MCD de dos numeros
     * @param a entero
     * @param b entero
     * @return  mcd de  los nuemros
     */
    public int MCD(int a, int b){
        List lista1= divisores(a);
        List lista2 = divisores(b);
        int mcd=0;
        for (Object i : lista2) {
            if ((lista1.contains(i) & (int) i>mcd))
                mcd=(int)i;
        }
        return mcd;
    }

    /**
     *  retorna el mcm de dos numeros
     * @param a entero
     * @param b enterto
     * @return minimo comun multiplo
     */
    public  int mcm(int a, int b){
        return  (int) (a*b)/MCD(a, b);
    }

    /**
     * Imprime una matrix por medio de un string
     * @param A una matrix
     * @return
     */


    /**
     * Suma  dos  matrtices del mismo tamanno
     * @param m1
     * @param m2
     * @return una matrix
     */
    public int[][] sumaMatriz(int[][] m1, int[][] m2){
        for (int i = 0; i <m1.length; i++) {
            for (int j = 0; j <m1[i].length; j++) {
                m1[i][j]+=m2[i][j];
            }
        }
        return m1;
    }
    
    
    /**
     * Resta  dos  matrtices del mismo tamanno
     * @param m1
     * @param m2
     * @return una matrix
     */
    public int[][] restaMatriz(int[][] m1, int[][] m2){
        for (int i = 0; i <m1.length; i++) {
            for (int j = 0; j <m1[i].length; j++) {
                m1[i][j]+=m2[i][j];
            }
        }
        return m1;
    }


    
    
    /**
     *  retorna el menor de una  matriz
     * @param matriz
     * @param f fila a eliminar
     * @param c columna a eliminar
     * @return  un matriz
     */
    public  int[][] menor(int [][] matriz , int f, int c){
        int[][] menor= new int[matriz.length-1][matriz.length-1];
        int posx=0;
        int posy;
        for (int i = 0; i < matriz.length; i++) {
            if (i!=f) {  
                posy=0;
                for (int j = 0; j < matriz.length; j++) {
                    if (j!=c) {
                        menor[posx][posy]=matriz[i][j];
                        posy++;
                    }
                }
                posx++;
           }           
        }
        return menor;
        }
        
    
    
   
  
    
    
    /**
     * calculan determinante de 2 por 2
     * @param m
     * @return 
     */
    public int  determinateBasico(int[][] m){
         return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    
    
    
    /**
     * retorna el determinante de una matriz
     * @param matrix cuadrada
     * @return 
     */
    public int determinanteMatrix(int[][] matrix){
        if (matrix.length==2)
            return determinateBasico(matrix);
        int suma=0;
        for (int i = 0; i < matrix.length; i++) {
            if (i%2==0)
                suma+=matrix[0][i]*determinanteMatrix(menor(matrix, 0, i));
            else
                suma-=matrix[0][i]*determinanteMatrix(menor(matrix, 0, i));
        }
        return suma;
    }


    /**
     * Retorna la transpuesta de una matriz
     * @param matriz una matriz de tamanno nxm
     * @return transpuesta
     */
    public int[][] transpuestaMatriz(int[][] matriz){
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i]=matriz[i][j];
            }
        }
        System.out.print(matrizToString(transpuesta));

        return transpuesta;
    }


 



    /**
     * Imprime un vector por medio de un string
     * @param fila
     * @param Inicio
     * @param Final
     * @return
     */
    public  String filaMatrizToString(int[] fila,
                                             String Inicio, String Final){
        String resp = Inicio + "";
        int columnas = fila.length;
        for (int m = 0; m < columnas - 1; m++)
            resp += fila[m] + "\t";
        resp += fila[columnas - 1] + "" + Final;
        return resp;
    }


    /**
     * Imprime una matrix por medio de un string
     * @param A una matrix
     * @return
     */
    public  String matrizToString(int[][] A){
        int filas = A.length;
        String resp = "";
        if (filas == 0)
            resp = "()";
        else if (filas == 1)
            resp = filaMatrizToString(A[0], "(", ")");
        else{
            resp += filaMatrizToString(A[0], "|", "|") + "\n";
            for (int n = 1; n < filas - 1; n++)
                resp += filaMatrizToString(A[n], "|", "|") + "\n";
            resp += filaMatrizToString(A[filas - 1], "|", "|");
        }
        return resp;
    }

    /**
     * Retorna la fila i aumentada k veces la fila j
     * @param matriz
     * @param i fila
     * @param j columna
     * @param k escalar
     * @return matriz
     */
    public int[][] sumaFilaMatriz(int[][] matriz,int i,int j, int k){
        for (int c = 0; c <matriz[0].length ; c++) {
            matriz[i][c]+= k*matriz[j][c];
        }
        System.out.print(matrizToString(matriz));
        return matriz;
    }

    /**
     * Calcula la norma de un vector
     * @param vector
     * @return norma de vector
     */
    public float normaVector(int[] vector){
        double suma=0;
        for (int i = 0; i <vector.length ; i++) {
            suma+= Math.pow(vector[i],2);
        }
        return (float) Math.sqrt(suma);
    }


    /**
     * Calcula el producto punto de dos vectores
     * @param v1 vector1
     * @param v2 vector 2
     * @return producto punto
     */
    public int productoPuntoVectores(int[] v1, int[] v2){
        int res=0;
        for (int i = 0; i <v1.length ; i++) {
            res+=v1[i]*v2[i];
        }
        return res;
    }


    public ArrayList criba(int n){
        int[] lista= new int[n+1];
        lista=cribaEratostenes(n,2,lista);
        ArrayList<Integer> primos=new ArrayList<>();
        for (int i = 2; i <lista.length ; i++) {
            if (lista[i]==0)
                primos.add(i);
        }
        return primos;
    }

    public int[] cribaEratostenes(int n , int i,int[] lista){
        if (i>Math.sqrt(n))
            return lista;
        if (lista[i]==1)
            return cribaEratostenes(n,i+1,lista);
        for (int j = i*2; j <lista.length ; j+=i) {
            lista[j]=1; /* se le asigna la marca de tachado */
        }
        i++;
        return cribaEratostenes(n,i,lista);
    }

    
    
    
    
       /**
     * Aproxima e^x con i iteraciones
     * @param x 
     * @param i iteraciones
     * @return aproximacion de e^x
     */
    public double exponencialBaseE(int x,int i){
        double sum=0;
        for (int j = 0; j <=i; j++) {
            sum+=  Math.pow(x,j)/factorialRecursivo(j);
        }
        return sum;
    }
    
    
    
    /**
     * Determina el producto de dos matrices
     * @param m1 matriz 1
     * @param m2 matriz 2 
     * @return  producto de matriz
     */
    public  int[][] productoMatriz(int[][] m1, int[][] m2){
        int[][] producto= new int[m1.length][m2[0].length];
        int i=0;
        int j=0;
        int columna=0;
        int suma=0;
        while (i<m1.length) {
            while (j<m2.length) {
                suma+=m1[i][j]*m2[j][columna];
                j++;}
            j=0;
            producto[i][columna]=suma;
            if (columna==m1.length-1){
                columna=0;
                i++;
            } 
            else columna++;
            suma=0;
        }
        return producto;
    }
    

    public static void main(String[] args) {
        Ejercicio ejemplo= new Ejercicio();


        int[][] m={{0,2,3,4},{3,4,5,0},{1,6,7,-8}};

        System.out.print(ejemplo.criba(100000));



    }

}
