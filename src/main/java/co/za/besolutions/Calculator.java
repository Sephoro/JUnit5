package co.za.besolutions;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Calculator {

    public double add(int a,int b){
        return a + b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double computeCircleArea(double radius){
        return this.multiply(this.multiply(radius,radius), Math.PI);
    }
}
