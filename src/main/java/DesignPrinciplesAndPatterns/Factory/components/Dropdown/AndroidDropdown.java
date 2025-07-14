package DesignPrinciplesAndPatterns.Factory.components.Dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public void showOptions() {
        System.out.println("Options from Android Dropdown");
    }
}
