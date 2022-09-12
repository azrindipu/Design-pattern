package builder;

public class PersonBuilder {
    private int id;
    private String name;
    private int age;
    private String fatherName;
    private String motherName;

    public PersonBuilder() {
    }

    public int getId() {
        return id;
    }

    public PersonBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public PersonBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public PersonBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public Person build(){
        return new Person(this);
    }
}
