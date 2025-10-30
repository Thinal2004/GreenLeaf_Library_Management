public class Book extends LibraryItem{
    private String isbn;
    private int publishedYear;

    public Book(String itemId,String title,String author,boolean available,String isbn,int publishedYear){
        super(itemId,title,author,available);
        this.isbn = isbn;
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getDetails(){
        return "Item id : " + this.getItemId() +"\n" +
                "Title : " + this.getTitle() +"\n" +
                "Author : " + this.getAuthor() +"\n" +
                "Availability : " + this.isAvailable() +"\n" +
                "ISBN : " + this.getIsbn() +"\n" +
                "Published Year : " + this.getPublishedYear();
    }
}
