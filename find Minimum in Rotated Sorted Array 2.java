// Problem Num :- 154
// Title :- Find Minimum in Rotated Sorted Array II 
// Link :- https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
class Solution {
    public int findMin(int[] nums) {
        
        int  i = 0;
        int j = nums.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(mid+1<nums.length && nums[mid]>nums[mid+1])return nums[mid+1];
            else if(nums[i] == nums[mid] && nums[mid] == nums[j]){
                i++;j--;
            }
            else if(nums[mid]>nums[j]){
                i = mid+1;
            }
            else j = mid;
        }
        return nums[i];
    }
}