package strategy;

public class Search {

    private SearchStretegy searchStretegy;
    public Search(SearchStretegy searchStretegy){
        this.searchStretegy = searchStretegy;
    }
    public int performSearch(int[] array, int target){
        return searchStretegy.search(array, target);
    }
}
