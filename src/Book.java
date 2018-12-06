import java.util.Date;

public class Book
{

    private int pages;
    private Date released;
    private String title;
    private String isbn;

    // Constructor

    public Book(int pages, Date released, String title, String isbn){
        this.pages = pages;
        this.released = released;
        this.title = title;
        this.isbn = isbn;
    }

    public Book(){}

    // Getter

    public int getPages()
    {
        return this.pages;
    }

    public Date getReleased()
    {
        return this.released;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    // Setter

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public void setReleased(Date released)
    {
        this.released = released;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
}
