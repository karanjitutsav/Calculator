/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Utsav Karanjit
 * Simple Calculator 
 */



import java.util.*;
import java.util.Scanner;
import static javafx.application.Platform.exit;
public class Calculator{    
    public static void main(String[] args)
    {
        
        int ans;
        int choose;
        int n=1;
        while(n==1){
            System.out.println("Enter first and second number:");
            Scanner inp= new Scanner(System.in);
            int num1,num2;
            num1 = inp.nextInt();
            num2 = inp.nextInt();
            System.out.println("Enter your selection: \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.division \n 5.Exit");
            choose = inp.nextInt();
            switch (choose){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;  
            case 3:
                System.out.println(mult( num1,num2));
                break;
            case 4:
                System.out.println(div( num1,num2));
                break;

           case 5:
                n=0;            
                System.out.println("Exiting");
                break;


           default:
                    System.out.println("Illigal Operation");
            }
        }       



    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}