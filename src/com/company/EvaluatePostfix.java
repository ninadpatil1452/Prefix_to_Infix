package com.company;

import javax.crypto.spec.PSource;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class EvaluatePostfix {
    public static int EvaluatePostfix(String exp){
        Stack<Integer> s = new Stack<>();
        char exp1[] = exp.toCharArray();
        for (int i = 0 ; i<=exp1.length-1;i++){
            if(isDigit(exp1[i])){
                s.push(exp1[i]-'0');
            }else {
                int op1 = s.pop();
                int op2 = s.pop();
                switch (exp1[i]){
                    case '*':
                        s.push( op1*op2);
                        break;
                    case '/':
                        s.push(op1/op2);
                        break;
                    case '+':
                        s.push(op1+op2);
                        break;
                    case '-':
                        s.push(op1-op2);
                        break;
                }
            }
        }
        return s.pop();
    }
}
