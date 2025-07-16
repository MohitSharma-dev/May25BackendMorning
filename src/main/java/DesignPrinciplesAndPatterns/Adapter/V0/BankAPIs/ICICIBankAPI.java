package DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs;

public class ICICIBankAPI {
    int balanceCheck(){
        System.out.println("ICICI Bank is checking the balance");
        return 100;
    }

    void moneyTransfer(int amount){
        System.out.println("Money has been transferred via ICICI Bank");
    }
}
