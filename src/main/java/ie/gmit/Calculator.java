package ie.gmit;


//This method will add two numbers
public class Calculator {
    int firstNum = 0, secondNum = 0, totalNum = 0;

    public int add(int x , int y) {
        totalNum = x + y;

        return totalNum;
    }

    public int subtract(int x , int y) {
        totalNum = x - y;

        return totalNum;
    }

    public int multiply(int x , int y) {
        totalNum = x * (y);

        return totalNum;
    }

    public int divide(int x , int y) {
        totalNum = x / y;

        return totalNum;
    }

}
