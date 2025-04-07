package com.xworkz.afterYudagi.Internal;

public class OnlineLibrary extends Library {
    public OnlineLibrary() {
        System.out.println("OnlineLibrary Constructor");
    }
    @Override
    public void addBook() {
        System.out.println("Library is  adding a new book");
    }
@Override
    public void issueBook() {
        System.out.println("Library is  issuing a book to a member");
    }
@Override
    public void returnBook() {
        System.out.println("Library is  processing a book return");
    }
@Override
    public void manageMembers() {
        System.out.println("Library is  managing members");
    }
@Override
    public void maintainCatalog() {
        System.out.println("Library is  maintaining the book catalog");
    }

    public void bombLibrary()
    {
        System.out.println("Bomb the library");
    }
}
