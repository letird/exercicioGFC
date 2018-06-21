
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
        pitagoras();
    }

    public static void tabuada() {
        System.out.println("Informe um número:");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
    }

    public static void fatorial() {
        System.out.println("Informe um número:");
        int n = s.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        System.out.println("Fatorial = " + fat);
    }

    public static void bascara() {
        System.out.println("Informe A:");
        int a = s.nextInt();
        System.out.println("Informe B:");
        int b = s.nextInt();
        System.out.println("Informe C:");
        int c = s.nextInt();
        double delta = (b * b) - (4 * a * c);
        double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("X1 = " + x1 +" e x2 = "+x2);
    }
    
    public static void pitagoras(){
        System.out.println("Informe A:");
        int a = s.nextInt();
        System.out.println("Informe B:");
        int b = s.nextInt();
        double catetos = (a*a) + (b*b);
        double hipotenusa = Math.sqrt(catetos);
        System.out.println("Hipotenusa: "+ hipotenusa);
    }
}

