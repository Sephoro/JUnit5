package co.za.besolutions;


public class Calculator {


    static class DivisionByZero extends Throwable {
        private String _msg = "Division By Zero!";

        public String msg(){
            return this._msg;
        }
    }

    public double add(int a,int b){
        return a + b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b) throws DivisionByZero {

        if(b == 0) throw new DivisionByZero();

        return a/b;
    }

    public double computeCircleArea(double radius){
        return this.multiply(this.multiply(radius,radius), Math.PI);
    }
}
