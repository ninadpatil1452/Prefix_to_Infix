package com.company;

import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String exp){
        String ans = new String("");
        Stack<Character> s = new Stack<>();
        char [] exp1 = exp.toCharArray();
        for (int i = 0 ; i<exp1.length;i++){
            if(exp1[i]=='('){
                s.push(exp1[i]);
            }else if(Character.isAlphabetic(exp1[i])){
                ans+=exp1[i];
            }else if(isOperator(exp1[i])){
                while (!s.isEmpty() && getPriority(s.peek())>=getPriority(exp1[i])){
                    ans+=s.pop();
                }
                s.push(exp1[i]);
            }else if(exp1[i]==')'){
                while (!s.isEmpty() && s.peek()!='(' ){
                    ans+=s.pop();
                }
                s.pop();
            }else {
                System.out.println("Invalid Statement");
                break;
            }
        }
        while (!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
    }
    public static boolean isOperator(char x){
        switch (x){
            case'+':
            case'-':
            case'*':
            case'/':
            case'^':
                return true;
        }
        return false;
    }
    public static int getPriority(char C){

        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;
        return 0;
    }
}
