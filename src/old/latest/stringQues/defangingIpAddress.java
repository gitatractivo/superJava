package old.latest.stringQues;

public class defangingIpAddress {
    public static void main(String[] args) {
        String str = "255.100.50.0";
        System.out.println(str);
        System.out.println(str.replace(".","[.]"));
    }
//    static String defang(String str){
//        String[] ans = str.split(".",-2);
//        str.replaceAll()
//        return ans[0]+"[.]"+ans[1]+"[.]"+ans[2]+"[.]"+ans[3];
//
//    }
}
