package com.company;

import java.util.*;

class solution {
    public int stacky(String[] tokens)
    {
        Stack<String> stack = new Stack<String>();
        int x, y;
        String result = "";
        int get = 0;
        char choice = '0';
        int value = 0;
        String p = "";
        for (int i = 0; i < tokens.length; i++) {
            if(i<2){
                stack.push(tokens[i]);
            }
            if(i==2){
                choice ='*';
            }
          //  stack.push(choice);
            if (choice == '*') {
                x = Integer.parseInt(stack.pop());
                y = Integer.parseInt(stack.pop());
                value = x * y;
                result = p + value;
                stack.push(result);

            }
        }
        System.out.println(stack.toString());
        return 0;//Integer.parseInt(stack.pop())
    }
}

      /*      if ('+'.equals(choice)) {

                x = Integer.parseInt(stack.pop());
                y = Integer.parseInt(stack.pop());
                value = x + y;
                result = p + value;
                stack.push(result);
            } else if ("-".equals(choice)) {
                x = Integer.parseInt(stack.pop());
                y = Integer.parseInt(stack.pop());
                value = y - x;
                result = p + value;
                stack.push(result);
            }
            } else if ("/".equals(choice)) {
                x = Integer.parseInt(stack.pop());
                y = Integer.parseInt(stack.pop());
                value = y / x;
                result = p + value;
                stack.push(result);
            } else {
                continue;
            }*/