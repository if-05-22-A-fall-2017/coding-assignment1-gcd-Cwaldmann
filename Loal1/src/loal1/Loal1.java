/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loal1;

import gcdCalculator.Calculator;

/**
 *
 * @author Clemi
 */
public class Loal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 124;
        int b = 42;
        System.out.println(calc.calcGCDEuc(a,b));
        System.out.println(calc.calcGCDPrime(a,b));
    }
    
}
