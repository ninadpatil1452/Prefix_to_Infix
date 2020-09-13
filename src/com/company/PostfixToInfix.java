package com.company;

import java.util.Stack;

public class PostfixToInfix {
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
    public static String postfixToInfix(String exp){
        char exp1[] = exp.toCharArray();
        Stack<String> s = new Stack<>();
        for (int i = 0;i<exp1.length;i++){
            if (isOperator(exp1[i])){
                String op1 = s.pop();
                String op2 = s.pop();
                String temp = "("+op2+exp1[i]+op1+")";
                s.push(temp);
            }
            else {
                s.push(Character.toString(exp1[i]));
            }
        }
        return s.pop();
    }
}
