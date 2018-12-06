import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf2
{

    public static void main(String[] args)
    {

        Date releasedate = new Date();
        List<Book> favouritebooks = new ArrayList<>();

        favouritebooks.add(new Book(200, releasedate, "My Book 1", "125215-12521-73473"));
        favouritebooks.add(new Book(200, releasedate, "My Book 2", "6437-623623-24254"));
        favouritebooks.add(new Book(200, releasedate, "My Book 3", "26326-734737-732473"));
        favouritebooks.add(new Book(200, releasedate, "My Book 4", "745854-124412-3487438348"));
        favouritebooks.add(new Book(200, releasedate, "My Book 5", "672-5236236-123483475125"));

        for (Book item : favouritebooks){
            System.out.println(item.getTitle() + " hat " + item.getPages() + " Seiten und folgende ISBN: " + item.getIsbn());
        }

    }

}
