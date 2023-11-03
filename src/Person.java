public class Person {
    private String name;
    private Integer age;
    private boolean married;

    public Person(String name, Integer age, boolean married) {
        this.name = name;
        //this.age = age;
        setAge(age);
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String isMarried() {
        String stareCivila = married == true ? "Pers casatorita" : "Pers necasatorita";
        return stareCivila;
    }

    public void setAge(Integer someAge) {
        if (someAge < 0 || someAge > 130) {
            //age = null;
            System.out.println("Varsta nu este reala");
        } else {
            age = someAge;
        }
    }

}
