/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasioCalculate;

import interfaces.ICalculate;

/**
 *
 * @author Admin
 */
public class CasioCalculate implements ICalculate{

    @Override
    public int cong(int s1, int s2) {
        return s1+s2;
    }

    @Override
    public int tru(int s1, int s2) {
        return s1-s2;
    }

    @Override
    public int nhan(int s1, int s2) {
        return s1*s2;
    }

    @Override
    public float chia(int s1, int s2) {
        return s1/s2;
    }
    
}
