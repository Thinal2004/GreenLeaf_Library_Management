public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean available;

    public LibraryItem(){};

    public LibraryItem(String itemId, String title, String author, boolean available) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public abstract String getDetails();

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "itemId='" + itemId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
