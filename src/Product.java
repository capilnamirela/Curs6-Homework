public class Product {
    private String name;
    private Integer price;
    private Integer quantity;
    private String category;
    private String categorieComparatie = "Textile";

    public Product(String name, Integer price, Integer quantity, String category) {
        this.name = name;
        this.price = price;
        if (hasStoc(quantity) == true) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
            System.out.println("prod nu este in stoc");
        }
        this.category = category;
        if (isCategory(category) == true) {
            System.out.println("Produsul face parte din categoria " + categorieComparatie);
        } else {
            System.out.println("Produsul nu face parte din categoria " + categorieComparatie);
        }
        ;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStoc(Integer someQuantity) {
        if (someQuantity > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String someCategory) {
        if (someCategory.equals(categorieComparatie)) {
            return true;
        } else {
            return false;
        }
    }
}
