package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Dropdown.Dropdown;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
//    Menu createMenu();
}
