package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
