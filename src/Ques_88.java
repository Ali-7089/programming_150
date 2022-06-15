public class Ques_88 {
    public static void main(String[] args) {
        int arr[] = {1,23,45,76,85};
        int first =0,last= arr.length-1,index =-1,k=23;
        while (first<=last){
            int mid = first + (last-first)/2;
            if (arr[mid]==k){
                index = mid;
                break;
            }else if(arr[mid]>k) last = mid-1;
            else first = mid+1;
        }
        System.out.println("Element found at index "+ index);
    }
}
