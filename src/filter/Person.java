package filter;

public class Person {
    private String name;
    private boolean married;
    private boolean male;

    public Person(String name, boolean married, boolean male) {
        this.name = name;
        this.married = married;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
