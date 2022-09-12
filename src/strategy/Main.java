package strategy;

public class Main {
    public static void main(String[] args){
        int[] sorted = {1,2,3,4,5};
        int[] unsorted = {5,2,3,1,4};
        int target = 3;
        SearchStretegy linearSearch = new LinearSearch();
        SearchStretegy binarySearch = new BinarySearch();
        Search searchLinear = new Search(linearSearch);
        System.out.println(searchLinear.performSearch(unsorted, target));
        Search searchBinary = new Search(binarySearch);
        System.out.println(searchBinary.performSearch(sorted, target));
    }
}
