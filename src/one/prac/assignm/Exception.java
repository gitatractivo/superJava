package one.prac.assignm;

class LessBalanceException extends Exception{
    public LessBalanceException(String message) {
        super(message);
    }
}
class BankAcc{
    private static int minBalance = 5000;
    private int amount;

    public BankAcc(int amount) {
        this.amount = amount;
    }
    public BankAcc() {
        this(minBalance);
    }
    public void deposit(int amt){
        amount+=amt;
    }
    public void withdraw(int amt) throws LessBalanceException{
        try{
            if(amount-amt<minBalance) throw new LessBalanceException("Insufficient balance");
            amount-=amt;
        }
        catch (LessBalanceException e){
            System.out.println(e.getMessage());
        }
    }
    public void getBalance(){
        System.out.println(amount);
    }

}

class m{
    public static void main(String[] args) throws Exception{
        BankAcc a = new BankAcc();
        a.deposit(1000);
        a.withdraw(500);
        a.getBalance();
    }
}
