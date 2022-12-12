package two.oops;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String exp = "";



    }


    public static int infixEval(String exp) {
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                opnds.push(ch - '0');
            } else if (ch == ')') {
                while(optors.peek() !=')'){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop();
            } else if (ch == '+' | ch == '-' | ch == '*' | ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' && presedence(ch) <= presedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }
        while(optors.size() >0){
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();
            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }

        return opnds.pop();
    }


    public static String infixToPost(String exp){
        Stack<String> post = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isLetterOrDigit(ch)) {
                post.push(ch+"");
            } else if (ch == ')') {
                while(operators.peek() != '('){
                    char op=operators.pop();
                    String postV2 = post.pop();
                    String postV1 = post.pop();
                    String postv = postV1 + postV2 + op;
                    post.push(postv);
                }
                operators.pop();
            } else if (ch == '+' | ch == '-' | ch == '*' | ch == '/') {
                while (operators.size() > 0 && operators.peek() != '(' && presedence(ch) <= presedence(operators.peek())){
                    char op=operators.pop();
                    String postV2 = post.pop();
                    String postV1 = post.pop();
                    String postv = postV1 + postV2 + op;
                    post.push(postv);
                }
                operators.push(ch);
            }

        }
        while(operators.size() >0 ){
            char op=operators.pop();
            String postV2 = post.pop();
            String postV1 = post.pop();
            String postv = postV1 + postV2 + op;
            post.push(postv);
        }
        return post.pop();
    }

    public static String infixToPre(String exp){
        Stack<String> pre = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isLetterOrDigit(ch)) {
                pre.push(ch+"");
            } else if (ch == ')') {
                while(operators.peek() != '('){
                    char op=operators.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    String prev = op+ v1 + v2 ;
                    pre.push(prev);
                }
                operators.pop();
            } else if (ch == '+' | ch == '-' | ch == '*' | ch == '/') {
                while (operators.size() > 0 && operators.peek() != '(' && presedence(ch) <= presedence(operators.peek())) {
                    char op=operators.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    String prev = op+ v1 + v2 ;
                    pre.push(prev);
                }
                operators.push(ch);
            }
        }
        while(operators.size()>0){
            char op=operators.pop();
            String v2 = pre.pop();
            String v1 = pre.pop();
            String prev = op+ v1 + v2 ;
            pre.push(prev);
        }
        return pre.pop();
    }







    public static int operation(int v1, int v2, char optor){
        if(optor=='+'){
            return v1+v2;
        }
        if(optor=='-'){
            return v1-v2;
        }if(optor=='*'){
            return v1*v2;
        }else{
            return v1/v2;
        }
    }

    public static int presedence(char optor){
        if(optor=='+' || optor=='-')  return 1;
        else if(optor=='*' || optor=='/')  return 2;
        return 3;
    }
}
