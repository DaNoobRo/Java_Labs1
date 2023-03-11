package Lab6;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount>{

    private String owner;
    private double balance;


    BankAccount(String owner,double balance ){
        this.owner=owner;
        this.balance=balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw (double amount){
        this.balance=this.balance-amount;
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return Double.compare(that.getBalance(), getBalance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBalance());
    }
    @Override
    public int compareTo(BankAccount o) {
        return Double.compare(this.getBalance(), o.getBalance());
    }

    //@Override
    //public String toString(){return "owner : " +this.getOwner()+ " balance : " +this.getBalance();}


    public static void main(String[] args) {
        BankAccount nr1 = new BankAccount("John",1234);
        BankAccount nr2 = new BankAccount("Jane",1234);
        System.out.println(nr1.equals(nr2));
        System.out.println(nr1.hashCode()==nr2.hashCode());
        nr1.withdraw(234);
        System.out.println(nr1.equals(nr2));
        System.out.println(nr1.hashCode()==nr2.hashCode());
        nr2.deposit(234);

    }


}
