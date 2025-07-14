package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.components.Button.Button;

public class Android extends Platform{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
