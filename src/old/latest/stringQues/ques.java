package old.latest.stringQues;

public class ques {
    public static void main(String[] args) {
        String str = "bappcapplecad";
//        System.out.println(string(str));
//        check2("","baccdaddap");
        System.out.println(check5(str));
    }
    static String string(String str){
        String ans = "";
        return check(str,ans,0);

    }
    static String check(String str,String ans, int i){
        if(i==str.length()) return ans;
        if(str.charAt(i) =='a') return check(str,ans,++i);
        ans+= str.charAt(i);
        return check (str,ans,++i);


    }
    static void check2 (String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        if(ch=='a') check2(p,up.substring(1));
        else check2(p+ch,up.substring(1));
    }
    static String check3 (String up){
        if(up.isEmpty()) {
            return "";
        }
        char ch= up.charAt(0);
        if(ch=='a') return check3(up.substring(1));
        return ch + check3(up.substring(1));
    }
    static String check4 (String up){
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")) return check4(up.substring(5));
        return up.charAt(0) + check4(up.substring(1));
    }
    static String check5 (String up){
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")) return check5(up.substring(3));
        return up.charAt(0) + check5(up.substring(1));
    }

}
