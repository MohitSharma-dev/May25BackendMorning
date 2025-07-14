package DesignPrinciplesAndPatterns.Factory;

public class PlatformFactory {
    public static Platform getPlatformByName(String platformName){
        Platform p = null;
        if(platformName.equals("Android")){
            p = new Android();
        } else if(platformName.equals("iOS")){
            p = new IOS();
        }
        return p;
    }
}
