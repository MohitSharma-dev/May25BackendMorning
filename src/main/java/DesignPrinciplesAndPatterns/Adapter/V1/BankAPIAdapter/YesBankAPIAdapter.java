package DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPI;

public class YesBankAPIAdapter implements BankAPI {
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney(int amount) {
        yesBankAPI.transfer(amount);
    }
}
