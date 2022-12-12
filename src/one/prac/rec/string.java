package one.prac.rec;

public class string {
    public static void main(String[] args) {
        String str ="bappleccdeappfad";
        System.out.println(skipAppNotApple(str));

    }
    public static String skipChar1(String str){
        StringBuilder ans = new StringBuilder();
        skipCharRev(str,0,ans);
        return ans.toString();
    }

    private static void skipCharRev(String str, int i, StringBuilder ans) {
        if(i==str.length()) return;

        if(str.charAt(i)!='a') ans.append(str.charAt(i));
        skipCharRev(str,++i,ans);

    }
    public static String skipChar(String str,int i){
        if(i==str.length()) return "";
        if(str.charAt(i)=='a')    return skipChar(str,i+1);
        return str.charAt(i) + skipChar(str,++i);
    }

    public static String skipChar(String str,String up){
        if(up.isEmpty()) return str;
        if(up.charAt(0)=='a')    return skipChar(str ,up.substring(1));
        return skipChar(str + up.charAt(0),up.substring(1));
    }
    public static String skipChar(String str){
        if(str.isEmpty()) return str;
        if(str.charAt(0)=='a')    return skipChar(str.substring(1));
        return str.charAt(0)+skipChar(str.substring(1));
    }
    public static String skipApple(String str){
        if(str.isEmpty()) return str;
        if(str.startsWith("apple"))    return skipApple(str.substring(5));
        return str.charAt(0)+skipApple(str.substring(1));
    }
    public static String skipAppNotApple(String str){
        if(str.isEmpty()) return str;
        if(str.startsWith("app") && !str.startsWith("apple"))    return skipAppNotApple(str.substring(3));
        return str.charAt(0)+skipAppNotApple(str.substring(1));
    }
}
