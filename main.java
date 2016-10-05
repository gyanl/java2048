/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.util.*;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Griddy TZFE = new Griddy();
        TZFE.addrandom2();
        TZFE.display();
        TZFE.pushdown();
        TZFE.display();
        
    Scanner reader = new Scanner(System.in);
    String c = reader.next();
    char ch = c.charAt(0);
    System.out.println(ch);
    }
    
}
