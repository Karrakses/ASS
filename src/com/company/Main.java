package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = ASS.infixToRpn("2*2+c");
        String[] result = s.split("");
        System.out.println(Arrays.toString(result));
      //  solution sol = new solution();
       // sol.stacky(result);

    }
}
