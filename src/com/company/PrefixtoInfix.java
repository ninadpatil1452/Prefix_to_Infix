package com.company;

import java.util.Stack;

public class PrefixtoInfix {
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
    public static String prefixToInfix(String exp){
        char exp1[] = exp.toCharArray();
        Stack<String> s = new Stack<>();
        for (int i = exp1.length-1;i>=0;i--){
            if (isOperator(exp1[i])){
                String op1 = s.pop();
                String op2 = s.pop();
                String temp = "("+op1+exp1[i]+op2+")";
                s.push(temp);
            }
            else {
                s.push(Character.toString(exp1[i]));
            }
        }
        return s.pop();
    }
}
