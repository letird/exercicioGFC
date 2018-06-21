
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Letícia Resmini Durigon
 */
public class Main {
    
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        fatorial();
    }
    
    public static void tabuada(){
        System.out.println("Informe um número:");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }
    
    public static void fatorial(){
       System.out.println("Informe um número:");
        int n = s.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        System.out.println("Fatorial = "+ fat);
    }
}
