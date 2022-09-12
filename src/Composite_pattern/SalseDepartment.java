package Composite_pattern;

public class SalseDepartment implements Component {

    private String deptName;

    public SalseDepartment(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public void operation() {
        System.out.println("I am "+deptName+" dept");
    }
}
