public class EBook extends LibraryItem{
    private String downloadLink;
    private double fileSizeMB;

    public EBook(String itemId,String title,String author,boolean available,String downloadLink,double fileSizeMB){
        super(itemId,title,author,available);
        this.downloadLink = downloadLink;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getDetails(){
        return "Item id : " + this.getItemId() +"\n" +
                "Title : " + this.getTitle() +"\n" +
                "Author : " + this.getAuthor() +"\n" +
                "Availability : " + this.isAvailable() +"\n" +
                "Download Link : " + this.getDownloadLink() +"\n" +
                "File size in MB : " + this.getFileSizeMB();
    }
}
