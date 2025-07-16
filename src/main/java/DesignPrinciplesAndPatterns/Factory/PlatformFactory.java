package DesignPrinciplesAndPatterns.Factory;

public class PlatformFactory {
    public static Platform getPlatformByName(String platformName){
        Platform p = null;
        if(platformName.equals("Android")){
            p = new Android();
        } else if(platformName.equals("iOS")){
            p = new IOS();
        } else {
            throw new RuntimeException("Platform Name Not Found");
        }
        return p;
    }
}
