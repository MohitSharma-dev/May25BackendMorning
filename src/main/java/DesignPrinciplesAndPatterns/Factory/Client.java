package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.IOSDropdown;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        // Based on the platform , we want to create new Buttons
        Button button = null;
        if(p instanceof Android){
            button = new AndroidButton();
        } else if (p instanceof IOS){
            button = new IOSButton();
        }

        button.click();

        Dropdown dropdown = null;
        if(p instanceof Android){
            dropdown = new AndroidDropdown();
        } else if (p instanceof IOS){
            dropdown = new IOSDropdown();
        }

        dropdown.showOptions();
    }
}
