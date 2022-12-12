package two.oops.assignm;

abstract class Bank {
    protected int custId, custAmt;
    public Bank(int custId, int custAmt) {
        this.custId = custId;
        this.custAmt = custAmt;
    }
    void withdraw(int amt) {
        custAmt-=amt;
    }
    void deposit(int amt) {
        custAmt+=amt;

    }
    void custDetails(){
        System.out.println("Customer Id:" + custId);
        System.out.println("Customer Balance:" + custAmt);

    }
    abstract void simpleInterest(int years);
    abstract void show();

}
class Sbi extends Bank{
    private float interest=7.5f;

    public Sbi(int custId, int custAmt) {
        super(custId, custAmt);
    }

    @Override
    void simpleInterest(int years) {
        System.out.println("S.I.: "+(interest*years*custAmt)/1000);
    }

    @Override
    void show() {
        System.out.println("Bank Name: Sbi");
        custDetails();
    }
}
class Axis extends Bank{
    private float interest=8.0f;

    public Axis(int custId, int custAmt) {
        super(custId, custAmt);
    }

    @Override
    void simpleInterest(int years) {
        System.out.println("S.I.: "+(interest*years*custAmt)/1000);
    }

    @Override
    void show() {
        System.out.println("Bank Name: Axis");
        custDetails();
    }
}
class Idfc extends Bank{
    private float interest=8.5f;

    public Idfc(int custId, int custAmt) {
        super(custId, custAmt);
    }

    @Override
    void simpleInterest(int years) {
        System.out.println("S.I.: "+(interest*years*custAmt)/1000);
    }

    @Override
    void show() {
        System.out.println("Bank Name: Idfc");
        custDetails();
    }
}
class main{
    public static void main(String[] args) {
        Bank a = new Sbi(1,1000);
        a.withdraw(100);
        a.show();
        a.simpleInterest(4);
        System.out.println();

        Bank b = new Axis(13,1000);
        b.deposit(150);
        b.show();
        b.simpleInterest(4);
        System.out.println();

        Bank c = new Idfc(15,1000);
        c.show();
        c.simpleInterest(4);
        System.out.println();
    }
}
