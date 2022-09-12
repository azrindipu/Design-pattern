package null_object_patter.with_null_object;

public class NullPerson extends PersonBase {
    private static NullPerson instance = null;
    private NullPerson() {
        this.id=Integer.MIN_VALUE;
        this.name="";
        this.age=Integer.MIN_VALUE;
    }
    public static synchronized NullPerson getInstance(){
        if(instance == null)
            instance = new NullPerson();
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new IllegalAccessError("This singleton object can not be cloned");
    }
}
