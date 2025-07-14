package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.components.Button.IOSButton;

public class IOS extends Platform{
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
