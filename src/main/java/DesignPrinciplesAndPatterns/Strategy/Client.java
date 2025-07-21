package DesignPrinciplesAndPatterns.Strategy;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your choice for login : ");

//        String choice = scanner.nextLine();
//        LoginStrategy loginStrategy = null;
//        if(choice.equalsIgnoreCase("google")){
//            loginStrategy = new GoogleLogin();
//        } else if(choice.equalsIgnoreCase("otp")){
//            loginStrategy = new OTPLogin();
//        } else if(choice.equalsIgnoreCase("username")){
//            loginStrategy = new UsernameLogin();
//        }
        LoginStrategy loginStrategy = LoginStrategyFactory.getLoginStrategy(scanner.nextLine());
        loginStrategy.login();
    }
}
