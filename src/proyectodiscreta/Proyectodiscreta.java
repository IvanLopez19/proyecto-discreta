/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiscreta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Lopez
 */
public class Proyectodiscreta {


    static int factorial(int n){
        int numero=1;
        for(int i=1; i<=n;i++){
            numero=numero*i;
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = entrada.nextLine();
        
        char letras[] = palabra.toCharArray();
        ArrayList<Integer>repeticiones= new ArrayList<Integer>();
        ArrayList<Character>b= new ArrayList<Character>();
        int count;
        boolean a;


        for(int e = 0; e < letras.length;e++){
            count = 0;
            a= b.contains(letras[e]);

            if(!a){
                for( int k = 0; k< letras.length; k++){
                    if(letras[e]==letras[k]){
                        count=count+1;
                    }
                }
            }
            if(count>=2){
                repeticiones.add(count);
            }
            
            b.add(letras[e]);

        }
        

                        
        if(repeticiones.size()!=0){
            int n=factorial(letras.length);
            int n2=1;
            for(int i=0; i<repeticiones.size();i++){
                n2=n2*factorial(repeticiones.get(i)); 
            }
            int respuesta= n/n2;
            System.out.println("el numero de permutaciones es: "+respuesta);
            
        }
        else{
            int opciones=1;
            for (int i = 1; i <=palabra.length(); i++) {
                opciones*= i;
            }
	System.out.println("Numero de permutaciones:" + opciones);

	char palabras[]=palabra.toCharArray();
	for (int i = 0; i < opciones; i++) {
            System.out.println(palabras);
            char t=palabras[i%(palabras.length-1)];
            palabras[i%(palabras.length-1)]=palabras[palabras.length-1];
            palabras[palabras.length-1]=t;
	}
        
        }
    }
    
}
    
