// Problem Num :- 1539
// Title :- Nth Missing Positive integer 
// Link :- https://leetcode.com/problems/kth-missing-positive-number/description/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int low  = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]-(mid+1) < k)low = mid+1;
            else high = mid-1;
        }       
        int ans =  high<0 ? k :arr[high] + (k-(arr[high]-(high+1))) ;
        return ans;
       
    }
}