package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter.ICICIBankAdapter;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter.YesBankAPIAdapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(100);
    }
}
