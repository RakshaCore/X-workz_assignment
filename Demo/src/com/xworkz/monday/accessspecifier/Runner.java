package com.xworkz.monday.accessspecifier;

public class Runner {
    public static void main(String [] args)
    {
        AccessSpecifier accessSpecifier=new AccessSpecifier();
        accessSpecifier.demoPublic();
        accessSpecifier.packageLevel();
      //  accessSpecifier.demoPrivate();

        accessSpecifier.accessDefault(accessSpecifier.color);
        accessSpecifier.accessPublic(accessSpecifier.age);
        accessSpecifier.accessPrivate(accessSpecifier.color);

    }
}
