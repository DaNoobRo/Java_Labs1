package Lab6;

import java.util.TreeSet;

public class Bank_TREESET {

    private TreeSet<BankAccount> accounts=new TreeSet<>();

    public void addAccount(BankAccount acc)
    {
        accounts.add(acc);
    }

    public TreeSet<BankAccount> getAllAccounts() {
        return accounts;
    }

    public void printAccounts(){
        for (BankAccount value : accounts)
            // Print the values
            System.out.println("The owner of the account is " + value.getOwner() + " and the account balance is " + value.getBalance());
    }
    public  void printAccounts(double minBalance,double maxBalance){
        for(BankAccount value : accounts){
            if(value.getBalance()>minBalance && value.getBalance()<maxBalance)
                System.out.println("The owner is " +value.getOwner()+ "and balance is : " +value.getBalance());
        }
    }


    public static void main(String[] args) {
        Bank_TREESET BT = new Bank_TREESET();
        for(int i=0; i<5; i++)
        {
            BankAccount acc = new BankAccount( "Memfis"+(5-i) , 10000 - i*1234);
            BT.addAccount(acc);
        }
        BT.printAccounts();
        BT.printAccounts(2000,3000);

        System.out.println("\nThe bank accounts sorted alphabetically after owner name : ");
        for(BankAccount acc : BT.getAllAccounts())
            System.out.println(acc.getOwner());


    }
}
