package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.Dropdown;

public abstract class Platform {
    public void setRefreshRate(){
        System.out.println();
    }

//    public abstract Button createButton();
    // NO NO NO ! HOLD on PLEASE!
//    public abstract Dropdown createDropdown();

    public abstract UIComponentFactory createUIComponentFactory();
}
