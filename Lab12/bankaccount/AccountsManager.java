package Lab12.bankaccount;

import java.util.ArrayList;

public class AccountsManager {

    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private String id;
    private int balance;

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public boolean exists(String id){
        for(int i = 0; i< accounts.size();i++)
        {
            if(accounts.get(i).getId() == id)
                return true;
        }
        return false;
    }

    public int count(){
        return accounts.size();
    }
}
