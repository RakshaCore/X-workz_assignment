package com.xworkz.collection1.CollectionIterator.Runner;

import com.xworkz.collection1.CollectionIterator.dto.BookDTO;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class BookRunner {
    public static void main(String[] args) {
        Collection<BookDTO> bookCollection = new LinkedList<BookDTO>();

        bookCollection.add(new BookDTO("The King","Vaibhav","Rishi","Fiction","Charly","English","Goa",500,"4.5","1st Edition"));
        bookCollection.add(new BookDTO("The Queen","Ravi","Kumar","Fantasy","Thalapathy","Telugu","Tamilnaadu",300,"4.0","2nd Edition"));
        bookCollection.add(new BookDTO("The Prince","Arjun","Sharma","Adventure","RajKumar","Kannada","Bengaluru",700,"4.8","3rd Edition"));
        bookCollection.add(new BookDTO("The Princess","Varsha","Arushi","Romance","Dilwale","Hindi","Delhi",400,"4.2","4th Edition"));
        bookCollection.add(new BookDTO("The Warrior","Karthik","Sohan","Action","Veeram","Kannada","Davangere",600,"4.6","5th Edition"));
        bookCollection.add(new BookDTO("The Hero","Ananya","Preetham","Drama","Katera","English","England",550,"4.3","6th Edition"));
        bookCollection.add(new BookDTO("The Villain","Suresh","Gopi","Psyco","Kiccha","Kannada","Mumbai",800,"4.9","7th Edition"));
        bookCollection.add(new BookDTO("The Detective","Nisha","Rani","Mystery","Sherlock","English","London",650,"4.7","8th Edition"));
        bookCollection.add(new BookDTO("The Scientist","Rohan","Sharma","Science","Einstein","Hindi","Delhi",900,"4.1","9th Edition"));
        bookCollection.add(new BookDTO("The Comedy","Priya","Kumari","Comedy","Mr Bean","Telugu","Hyderabad",750,"4.4","10th Edition"));


        Iterator<BookDTO> bookIterator= bookCollection.iterator();
        while (bookIterator.hasNext()){
            System.out.println(bookIterator.next());
            System.out.println("--------------------------------------------------");
        }
    }
}
