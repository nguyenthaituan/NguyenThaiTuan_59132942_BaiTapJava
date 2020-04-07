/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenthaituan_59132942_btjava;

import CasioCalculate.CasioCalculate;
import interfaces.ICalculate;

/**
 *
 * @author Admin
 */
public class NguyenThaiTuan_59132942_BTJaVa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICalculate calculate = new CasioCalculate();
        System.out.println("4 + 3 = " + calculate.cong(4, 3));
    }
    }
 
