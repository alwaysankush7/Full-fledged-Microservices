abstract class Fruit {
    abstract int cost();
}

class Apple1 extends Fruit {
    private int price;
    Apple1(int cost) {
        this.price = cost;
    }
    int cost() {
        return price;
    }
}

class Mango1 extends Fruit {
    private int price;
    Mango1(int cost) {
        this.price = cost;
    }
    int cost() {
        return price;
    }
}

class Cost{
    public static void main(String[] args) {
        Fruit apple = new Apple1(123);
        System.out.println(" The price of apple is " + apple.cost());
        Fruit mango = new Mango1(24);
        System.out.println(" The price of mango is " +mango.cost());
    }
}