package DesignPrinciplesAndPatterns.Strategy;

public class OTPLogin implements LoginStrategy{
    public void login(){
        System.out.println("Loggin in via OTP");
    }
}
