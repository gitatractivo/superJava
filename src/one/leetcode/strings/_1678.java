package one.leetcode.strings;
//https://leetcode.com/problems/goal-parser-interpretation/
public class _1678 {
    public static String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;


    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
}
