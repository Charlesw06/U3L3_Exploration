public class CatHouseRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Moon", 10);
        Cat cat2 = new Cat("Moon", 12);
        CatHouse house1 = new CatHouse(cat1, cat2, "Jerry");

        System.out.println(house1.toString());
    }
}
