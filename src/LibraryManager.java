public interface LibraryManager {
    void addItem(Library item);
    void removeItem(String id);
    void listItems();
    void addMember(Member m);
    void borrowBook(String mid, String id);
    void returnBook(String mid, String id);
    void runMenu();
    void runGUI();
}
