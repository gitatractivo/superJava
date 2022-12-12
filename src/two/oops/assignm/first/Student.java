package two.oops.assignm.first;
 public class Student {
    protected String name,fatherName,city;
    protected int roll,mNo;

    public Student(String name, String fatherName, String city, int roll, int mNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.city = city;
        this.roll = roll;
        this.mNo = mNo;
    }
    public void show_basic(){
        System.out.println("name:"+name);
        System.out.println("fatherName:"+fatherName);
        System.out.println("city:"+city);
        System.out.println("mNo:"+mNo);
        try{
            if((int)(Math.log10(roll))<2){
                throw new InvalidRollException("Invalid Roll Number");
            }
        }
        catch (InvalidRollException e){
            System.out.println(e);
        }
    }
}

