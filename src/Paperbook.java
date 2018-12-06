import java.util.Date;

public class Paperbook extends Book
{

    private String series;
    private String month;

    // Constructor

    public Paperbook(int pages, Date released, String title, String isbn, String series, String month){
        super(pages, released, title, isbn);
        this.series = series;
        this.month = month;
    }

    public Paperbook(){}

    // Getter

    public String getSeries()
    {
        return this.series;
    }

    public String getMonth()
    {
        return this.month;
    }

    // Setter

    public void setSeries(String series)
    {
        this.series = series;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

}
