package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.Dropdown;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
