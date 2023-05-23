class Rectangle {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void Area(){
        int area = length*breadth;
        System.out.println("Area is " + area);
    }
}
 class A{
     public static void main(String[] args) {
         Rectangle rectangle=new Rectangle(12,12);
         rectangle.Area();
     }
 }