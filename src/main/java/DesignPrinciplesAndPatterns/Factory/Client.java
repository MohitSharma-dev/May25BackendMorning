package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.IOSDropdown;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String platformName = scanner.nextLine();
        Platform p = PlatformFactory.getPlatformByName(platformName);
//        if(platformName.equals("Android")){
//            p = new Android();
//        } else if(platformName.equals("iOS")){
//            p = new IOS();
//        }

        // Based on Platform, we first create the factory
        UIComponentFactory componentFactory = p.createUIComponentFactory();
        // Based on the platform , we want to create new Buttons
        Button button = componentFactory.createButton();
//        if(p instanceof Android){
//            button = new AndroidButton();
//        } else if (p instanceof IOS){
//            button = new IOSButton();
//        }

        button.click();

        Dropdown dropdown = componentFactory.createDropdown();
//        if(p instanceof Android){
//            dropdown = new AndroidDropdown();
//        } else if (p instanceof IOS){
//            dropdown = new IOSDropdown();
//        }

        dropdown.showOptions();

        // Option 2 : Move if - else to a dedicated class
    }
}
