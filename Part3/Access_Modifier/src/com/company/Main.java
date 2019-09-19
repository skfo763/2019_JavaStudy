package com.company;

public class Main extends abs implements Inter {

    public static void main(String[] args) {
        Main c = new Main();
        int t = c.add(15, 5);
        int x = c.pow(10, 3);
        System.out.println(t);
        System.out.println(x);
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public int div(int a, int b) {
        return 0;
    }

    @Override
    int pow(int a, int b) {
        int result = a;

        for(int i=0; i<b-1; i++) {
            result *= a;
        }
        return result;
    }
}
