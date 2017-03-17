/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaini;
import java.util.Scanner;
/**
 *
 * @author vithursan
 */
public class JavaIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, World!");
        Scanner userInput = new Scanner(System.in);
        String inp = userInput.nextLine();
        System.out.println("Hello, " + inp);
        
        for(int i=10; i>1; i--){
              System.out.println("The value of i is: "+i);
         }
        int [] numbers = {10, 20, 30, 40, 50};
        
        for(String i : userInput){
            System.out.println(i);
        }
//        inputList = userInput.skip("/")[]
    }
    
}
