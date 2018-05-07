/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author turupawn
 */
public class Ejercicios {

    static int sumar(int x, int y) {
        int c;
        c=x+ y;
        return c;
    }

    static int restar(int x, int y) {
        int c;
        c=x- y;
        return c;
    }

    static int multiplicar(int x, int y) {
        int c;
        c=x* y;
        return c;
    }

    static int residuo(int x, int y) {
        int resultado=x%y;
        return resultado;
    }

    static boolean esPar(int x) {
        boolean respuesta;
        if(x %2==0)
            respuesta= true;
        else
            respuesta=false;
        return respuesta;
        
    }

    static boolean esMultiploDe3(int x) {
        boolean respuesta;
        if(x %3==0)
            respuesta= true;
        else
            respuesta=false;
        return respuesta;        

    }

    static int getMayor(int x, int y) {
        if(x>y){    
        return x ;
        }else{
            return y;
        }
    }

    static boolean esMayorDeEdad(int edad) {
        boolean respuesta;
        if(edad>17){
            respuesta =true;
            
        }else{
            respuesta=false;
        }
        
        return respuesta;
    }

    static boolean sonPares(int x, int y, int z) {
        boolean respuesta;
        if((x%2==0)&&(y%2==0)&&(z%2==0))
            respuesta= true;
        else
            respuesta=false;
        return respuesta;
    }

    static int getMayorDe3(int x, int y, int z) {
        int respuesta = 0;
        if(x>y && x>z)   
            respuesta=x;
        if(y>x && y>z)
            respuesta=y;
        if(z>y && z>x)
            respuesta=z;        
        return respuesta;

    }

}
