 class Book {
    private int bookId;
    private String bookName;
    private int bookPrice;

    Book(int bookId, String bookName, int bookPrice){
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
    public void display(){
        System.out.println("Book " + bookId + "name " + bookName + "price " + bookPrice);
    }
}

class  SpecialEditionBook extends Book {
    private int discount;
    public SpecialEditionBook(int bno, String bname, int price, int discount) {
        super(bno, bname, price);
        this.discount = discount;
    }
    public void display(){
        super.display();
        System.out.println("Special discount " + discount );
    }
}
class Special{
    public static void main(String[] args) {
        SpecialEditionBook special= new SpecialEditionBook(123,"Get Shit done",527,100);
        special.display();
    }
}