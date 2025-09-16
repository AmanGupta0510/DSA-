// Problem Num :- 153
// Title :- Find Minimum in Rotated Sorted Array  
// Link :- https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if( mid+1 < nums.length && nums[mid]>nums[mid+1])return nums[mid+1];
            else if(nums[mid]>nums[j])i = mid+1;
            else{
                j = mid;
            }
        }
        return nums[i];

    }
}