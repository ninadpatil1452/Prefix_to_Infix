package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrefixtoInfix PTIans = new PrefixtoInfix();
        EvaluatePostfix EPans = new EvaluatePostfix();
        InfixToPrefix ITPans = new InfixToPrefix();
        PrefixToPostfix PTPans = new PrefixToPostfix();
        EvaluatePrefix EPreans = new EvaluatePrefix();
        InfixToPostfix ITPOans = new InfixToPostfix();
        PostfixToInfix PosTIans = new PostfixToInfix();
        PostfixToPrefix PosTPans = new PostfixToPrefix();
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of task available to perform: \n");
        System.out.println("1.Prefix to Infix\n" +
                "2.Evaluate Postfix\n" +
                "3.Infix to Prefix\n" +
                "4.Prefix to Postfix\n" +
                "5.Evaluate Prefix\n" +
                "6.Infix to Postfix\n" +
                "7.Postfix to infix\n" +
                "8.Postfix to prefix\n");
        System.out.println("Enter the String : ");
        String str = scanner.nextLine();
        System.out.println("Enter the option : ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println(PTIans.prefixToInfix(str));
                break;
            case 2:
                System.out.println(EPans.EvaluatePostfix(str));
                break;
            case 3:
                System.out.println(ITPans.infixToPrefix(str));
                break;
            case 4:
                System.out.println(PTPans.prefixToPostfix(str));
                break;
            case 5:
                System.out.println(EPreans.EvaluatePrefix(str));
                break;
            case 6:
                System.out.println(ITPOans.infixToPostfix(str));
                break;
            case 7:
                System.out.println(PosTIans.postfixToInfix(str));
                break;
            case 8:
                System.out.println(PosTPans.prefixToPostfix(str));
                break;
        }
    }
}
