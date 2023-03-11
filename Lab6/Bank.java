package Lab6;

import java.util.ArrayList;
import java.util.Collections;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();



    public void addAccount(String owner ,double balance){
        BankAccount o = new BankAccount(owner, balance) ;
        accounts.add(o);
    }

    public BankAccount getAccount(String owner)
    {
        for(BankAccount acc : accounts)
            if(acc.getOwner().equals(owner))
                return acc;
        return null;
    }
    public ArrayList<BankAccount> getAllAccounts()
    {
        return accounts;
    }


    public void printAccounts()
    {
        ArrayList<BankAccount> copy = accounts;

        for(int i=0; i<copy.size()-1; i++)
            for(int j=i+1; j<copy.size(); j++)
                if(copy.get(i).getBalance() > copy.get(j).getBalance())
                    Collections.swap(copy, i, j);

        for(BankAccount acc : copy)
            System.out.println("The owner of the account is " + acc.getOwner() + " and the account balance is " + acc.getBalance());
    }
    public  void printAccounts(double minBalance,double maxBalance){
        for(BankAccount value : accounts){
            if(value.getBalance()>minBalance && value.getBalance()<maxBalance)
                System.out.println("The owner is " +value.getOwner()+ "and balance is : " +value.getBalance());
        }
    }
    public void SortAlphabetically()
    {
        for(int i=0; i<accounts.size()-1; i++)
            for(int j=i+1; j<accounts.size(); j++)
                if(accounts.get(i).getOwner().compareTo(accounts.get(j).getOwner()) > 0)
                    Collections.swap(accounts, i, j);
    }


    public static void main(String[] args) {
        Bank BT = new Bank();
        BT.addAccount("JOHN", 4567);
        BT.addAccount("Mirandsa", 2345);
        BT.addAccount("DEli", 2333);

        BT.printAccounts();
        BT.printAccounts(2000,3000);
        BT.SortAlphabetically();
        BT.printAccounts(10,5000);

    }
}
