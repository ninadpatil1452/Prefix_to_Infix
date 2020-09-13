package com.company;

import java.util.Stack;

public class PostfixToPrefix {
    public static boolean isOperator(char x){
        switch (x){
            case'+':
            case'-':
            case'*':
            case'/':
                return true;
        }
        return false;
    }
    public static String prefixToPostfix(String exp){
        char exp1[] = exp.toCharArray();
        Stack<String> s = new Stack<>();
        for (int i =0 ; i<exp1.length;i++){
            if (isOperator(exp1[i])){
                String op1 = s.pop();
                String op2 = s.pop();
                String temp = exp1[i]+op2+op1;
                s.push(temp);
            }
            else {
                s.push(Character.toString(exp1[i]));
            }
        }
        return s.pop();
    }
}
