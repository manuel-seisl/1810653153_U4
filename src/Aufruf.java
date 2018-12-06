import java.util.Date;

public class Aufruf
{

    public static void main(String[] args)
    {

        Date releasedate = new Date(118, 9, 2, 14, 9, 54);
        Book a = new Book(200, releasedate, "My Book", "125215-12521-73473");

        System.out.println("Das Buch hat " + a.getPages() + " Seiten, wurde am " + a.getReleased() + " veröffentlicht und hat den Titel " + a.getTitle());

    }

}