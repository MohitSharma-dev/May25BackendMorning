package DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPI;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI {
    private ICICIBankAPI iciciBankAPI  = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return iciciBankAPI.balanceCheck();
    }

    @Override
    public void transferMoney(int amount) {
        iciciBankAPI.moneyTransfer(amount);
    }
}
