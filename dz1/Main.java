public class Main {

    public static void main(String[] args) {
        
        
        Product hot1 = new HotDrink("latte",80);
        System.out.println(hot1.getInfo());

        Product hot3 = new HotDrink("cappuccino",90);
        System.out.println(hot3.getInfo());

        Product hot2 = new HotDrink("espresso", 65, 80, 0.2);
        System.out.println(hot2.getInfo());


    }
}