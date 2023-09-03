package com.driver;

class Product {

    public int product(int x, int y) {
        return x*y ;
    }

    public double product(double x, double y) {
        return x*y ;
    }
    public int product(int x, int y, int z) {
        return x*y*z ;
    }




}
public class Main {

    public static void main(String[] args){
        Product p = new Product() ;

        p.product(1,2) ;
        p.product(1,2,3) ;
        p.product(1.0, 2.0) ;

    }
}