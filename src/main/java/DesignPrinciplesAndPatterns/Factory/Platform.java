package DesignPrinciplesAndPatterns.Factory;

import DesignPrinciplesAndPatterns.Factory.components.Button.Button;

public abstract class Platform {
    public void setRefreshRate(){
        System.out.println();
    }

    public abstract Button createButton();
}
