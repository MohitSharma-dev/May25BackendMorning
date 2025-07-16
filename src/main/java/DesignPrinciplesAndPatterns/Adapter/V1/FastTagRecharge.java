package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.YesBankAPI;

public class FastTagRecharge {
    public boolean recharge(int amount, BankAPI bankAPI){
        if(bankAPI.checkBalance() > amount){
            System.out.println("Successful!");
            return true;
        }
        return false;
    }
}
