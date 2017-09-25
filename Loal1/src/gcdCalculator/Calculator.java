/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clemi
 */
public class Calculator {

    
    public int calcGCDEuc(int a, int b) {
        if (b == 0)
            return a;
        return 
            calcGCDEuc(b, a%b);
    }

    public int calcGCDPrime(int a, int b) {
        List<Integer> primForA = getPrim(a);
        List<Integer> primForB = getPrim(b);
        
        List<Integer> commonPrim = getCommon(primForA, primForB);
        
        int tmp = commonPrim.get(0);
        for(int i = 0; i<commonPrim.size()-1; i++)
        {
            tmp = tmp*commonPrim.get(i+1);
        }
        return tmp;
    }

    private List<Integer> getPrim(int a) {
        List<Integer> factors = new ArrayList<Integer>();
        
        int n = a;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        
        return factors;
    }

    private List<Integer> getCommon(List<Integer> primForA, List<Integer> primForB) {
        primForB.retainAll(primForA);
        return primForB;
    }
    
}
