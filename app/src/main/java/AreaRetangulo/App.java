/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AreaRetangulo;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        float base   = 0;
        float altura = 0;
        float area   = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Base: ");
        base = leitor.nextFloat();
        
        System.out.println("Altura");
        altura = leitor.nextFloat();
        
        //System.out.println("Area -> " + base * altura);
        area = base * altura;
        System.out.println("Area -> " + area);
        
        
        
        
        
        
        
        
        
    }
}
