package Practice.BankingSystem;

import java.util.HashMap;

public class BankManager {
    private HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public void createAccount(int accountNo, String name) {
        if (!accounts.containsKey(accountNo)) {
            accounts.put(accountNo, new BankAccount(accountNo, name));
        }
    }

    public BankAccount getAccount(int accountNo) {
        return accounts.get(accountNo);
    }
}
