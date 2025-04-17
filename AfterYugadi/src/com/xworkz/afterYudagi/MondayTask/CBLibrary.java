package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Library;
import com.xworkz.afterYudagi.Internal.OnlineLibrary;

public class CBLibrary {
    public void visitLib(Library library)
    {
        library.addBook();
        library.issueBook();
        library.returnBook();
        library.manageMembers();
        library.maintainCatalog();

        if (library instanceof OnlineLibrary)
        {
            OnlineLibrary onlineLibrary =(OnlineLibrary) library;
            onlineLibrary.bombLibrary();
        }
    }
}
