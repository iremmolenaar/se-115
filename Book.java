public class Book {
    public String title;
    public int pages;
    public Book  (String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void addPages(int extra_pages){this.pages+=extra_pages;}
    public void printBook(){
        System.out.println("Title: " + title);
    System.out.println("Pages: " + pages);}

}
