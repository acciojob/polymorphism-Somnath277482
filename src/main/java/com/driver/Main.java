package com.driver;

class Product {

    public int product(int x, int y) {
        return x ;
    };

    public int product(int x, int y, int z) {
        return x ;
    }

    public double product(double x, double y) {
        return x ;
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