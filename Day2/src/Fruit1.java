public interface Fruit1 {
    int cost();
}
class Apple implements Fruit1{
    private int price;
    Apple(int price){
        this.price = price;
    }
    public int cost(){
        return price;
    }
}

class  Mango implements Fruit1{
    private int price;
    Mango(int price){
        this.price = price;
    }
    public int cost(){
        return price;
    }
}

class Price{
    public static void main(String[] args) {
        Fruit1 apple = new Apple(4235);
        System.out.println("Apple price is : " + apple.cost());
        Fruit1 mango=   new Mango(234);
        System.out.println("The price of mango  is : " +mango.cost());
    }
}