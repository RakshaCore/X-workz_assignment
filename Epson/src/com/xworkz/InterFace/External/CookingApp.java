package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Recipe;

public class CookingApp {
    private Recipe recipe;

    public CookingApp(Recipe recipe) {
        this.recipe = recipe;
        System.out.println("Running CookingApp");
    }

    public void cook() {
        if (this.recipe != null) {
            this.recipe.prepare();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
