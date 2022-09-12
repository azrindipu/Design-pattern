package Composite_pattern;

public class Client {
    public static void main(String[] agrs){

        Component finance = new FinanceDepartment("Finance");
        Component salse = new SalseDepartment("Salse");
        Composite composite = new Composite();
        composite. add(finance).add(salse);
        composite.operation();
    }
}
