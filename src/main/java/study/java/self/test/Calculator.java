package study.java.self.test;

public class Calculator {
    public Integer add(int n1, int n2){
        return n1 + n2;
    }

    public int divide(int n1, int n2) {
        if(n1 == 0 || n2 == 0){
            throw new IllegalArgumentException("Can't divide by Zero");
        }else{
            return n1 / n2;
        }
    }
}
