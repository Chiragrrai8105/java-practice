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
        BOOK book2 = new BOOK();
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
            book2.bookname="ONE PAGE";
            book2.bookauthor="Akshar Rai";
            book2.id=102;
            book2.pagenumber=600;
            book2.publisher="Google";
            book2.origin="Russia";
            System.out.println("Book Name"+book2.bookname);
            System.out.println("Book Author"+book2.bookauthor);
            System.out.println("Book ID"+book2.id);
            System.out.println("Page Number"+book2.pagenumber);
            System.out.println("Publisher"+book2.publisher);
            System.out.println("Book Origin"+book2.origin);
    }
}
