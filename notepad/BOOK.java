class BOOK
{
    String bookname;
    String bookauthor;
    int id;
    int pagenumber;
    String publisher;
    String origin;
    public static void main(String[] args)
    {
        BOOK book1 = new BOOK();
        employee ashith = new employee();
            book1.bookname="ONE PAGE";
            book1.bookauthor="Chirag Rai";
            book1.id=101;
            book1.pagenumber=500;
            book1.publisher="Google";
            book1.origin="India";
            System.out.println("Book Name"+book1.bookname);
            System.out.println("Book Author"+book1.bookauthor);
            System.out.println("Book ID"+book1.id);
            System.out.println("Page Number"+book1.pagenumber);
            System.out.println("Publisher"+book1.publisher);
            System.out.println("Book Origin"+book1.origin);
            ashith.name="Ashith Rai";
            ashith.id=101;
            ashith.sal=1000001;
            System.out.println("--------------------");
            System.out.println("Name"+ashith.name);
            System.out.println("ID"+ashith.id);
            System.out.println("Salary"+ashith.sal);
    }
}
