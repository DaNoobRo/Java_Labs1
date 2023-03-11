package Lab12.bankaccount;

public class TransferContext {

    public void transfer(BankAccount sender, BankAccount receiver, int amount){
        sender.decrease(amount);
        receiver.increase(amount);
    }

}
