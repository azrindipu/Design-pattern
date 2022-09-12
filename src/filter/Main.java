package filter;

public class Main {
    public static void main(String[] args){
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.generatePersons();

        Filter maleFilter = new MaleFilter();
        Filter marriedFilter = new MarriedFilter();
        Filter maleAndMarriedFilter = new MarriedAndMale(marriedFilter, maleFilter);

        System.out.println("Male filter result:");
        personBuilder.printList(maleFilter.filter(personBuilder.getList()));
        System.out.println("Married filter result:");
        personBuilder.printList(marriedFilter.filter(personBuilder.getList()));
        System.out.println("Male And Married filter result:");
        personBuilder.printList(maleAndMarriedFilter.filter(personBuilder.getList()));
    }
}
