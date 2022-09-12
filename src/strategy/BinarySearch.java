package strategy;

public class BinarySearch implements SearchStretegy{
    @Override
    public int search(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
        while (end >= start){
            int mid = start + (end - start)/2;
            if(array[mid]==target){
                return mid;
            }else if(target > array[mid]){
                end = mid+1;
            }else{
                start = mid-1;
            }
        }
        return -1;
    }
}
