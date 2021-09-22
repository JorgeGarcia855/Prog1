package main;

public class Nuevo {
    public static void main(String[] args) {
        long num = 34532945454543320l;
        if (num%100 == 0){
            String newzero = num%1000 +"0";
            System.out.println(newzero);
        }else {
            System.out.println(num%1000);
        }
    }
}
