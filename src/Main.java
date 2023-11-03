public class Main {
    public static void main(String[] args) {

        Person myPerson = new Person("Ana", 25, true);
        System.out.println("Numele este: " + myPerson.getName());
        if (myPerson.getAge() != null) {
            System.out.println("Varsta este: " + myPerson.getAge());
        }
        System.out.println("Starea civila: " + myPerson.isMarried());

        Person myPerson1 = new Person("Dana", 44, true);
        System.out.println("Numele este: " + myPerson1.getName());
        if (myPerson.getAge() != null) {
            System.out.println("Varsta este: " + myPerson.getAge());
        }
        System.out.println("Starea civila: " + myPerson1.isMarried());

        Person myPerson2 = new Person("Mihai", 2223, false);
        System.out.println("Numele este: " + myPerson2.getName());
        if (myPerson2.getAge() != null) {
            System.out.println("Varsta este: " + myPerson2.getAge());
        }
        System.out.println("Starea civila: " + myPerson2.isMarried());

        System.out.println("----------------------------------");

        Product myProduct = new Product("Cafea", 50, -2, "Alimente");
        System.out.println("Produsul este: " + myProduct.getName() + ", pretul este: " + myProduct.getPrice() + ", cantitatea din stoc: " + myProduct.getQuantity() + ", face parte din categoria: " + myProduct.getCategory());

        Product myProduct1 = new Product("Rochie", 150, 2, "Textile");
        System.out.println("Produsul este: " + myProduct1.getName() + ", pretul este: " + myProduct1.getPrice() + ", cantitatea din stoc: " + myProduct1.getQuantity() + ", face parte din categoria: " + myProduct1.getCategory());

        Product myProduct2 = new Product("Aragaz", 950, 4, "Electrocasnice");
        System.out.println("Produsul este: " + myProduct2.getName() + ", pretul este: " + myProduct2.getPrice() + ", cantitatea din stoc: " + myProduct2.getQuantity() + ", face parte din categoria: " + myProduct2.getCategory());

        System.out.println("-----------------------------------");

        Bottle myBottle = new Bottle(2000, 1500, false);
        System.out.println("Capacitatea sticlei: " + myBottle.getTotalCapacityML() + ", Cantitatea disponibila: " + myBottle.getAvailableLiquidML());

        System.out.println("Cantitatea disponibila este mai mare decat capacitatea: " + myBottle.isMoreLiquid());
        System.out.println("Spatiul gol: " + myBottle.getEmptyCapacity());
        myBottle.openBottle();
        myBottle.openBottle();
        myBottle.closeBottle();
        myBottle.closeBottle();
        System.out.println(myBottle.drankLiquid(1750));
        myBottle.openBottle();
        System.out.println(myBottle.drankLiquid(1750));
        System.out.println(myBottle.drankLiquid(250));

    }
}
