import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf3
{

    public static void main(String[] args)
    {

        Date releasedate = new Date();
        List<Paperbook> paperbooks = new ArrayList<>();

        paperbooks.add(new Paperbook(200, releasedate, "My Paperbook 1", "00000-000000-0000", "1", "April"));
        paperbooks.add(new Paperbook(210, releasedate, "My Paperbook 2", "00000-000000-0000", "2", "April"));
        paperbooks.add(new Paperbook(240, releasedate, "My Paperbook 3", "00000-000000-0000", "3", "January"));
        paperbooks.add(new Paperbook(100, releasedate, "My Paperbook 4", "00000-000000-0000", "3", "March"));
        paperbooks.add(new Paperbook(140, releasedate, "My Paperbook 5", "00000-000000-0000", "3", "October"));

        for (Paperbook item : paperbooks){
            System.out.println(item.getTitle() + " hat " + item.getPages() + " Seiten und folgende ISBN: " + item.getIsbn() + " zusätzlich ist es im Monat " + item.getMonth());
        }

    }

}
