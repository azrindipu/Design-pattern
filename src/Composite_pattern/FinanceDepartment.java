package Composite_pattern;

public class FinanceDepartment implements Component{
    private String deptName;

    public FinanceDepartment(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public void operation() {
        System.out.println("I am "+deptName+" dept");
    }
}
