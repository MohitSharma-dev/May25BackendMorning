package DesignPrinciplesAndPatterns.Strategy;

public class LoginStrategyFactory {
    public static LoginStrategy getLoginStrategy(String choice){
        LoginStrategy loginStrategy = null;
        if(choice.equalsIgnoreCase("google")){
            loginStrategy = new GoogleLogin();
        } else if(choice.equalsIgnoreCase("otp")){
            loginStrategy = new OTPLogin();
        } else if(choice.equalsIgnoreCase("username")){
            loginStrategy = new UsernameLogin();
        }
        return loginStrategy;
    }
}
