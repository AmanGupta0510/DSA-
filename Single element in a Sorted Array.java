// Problem Num :- 540
// Title :- Single Element in a Sorted Array
// Link :- https://leetcode.com/problems/single-element-in-a-sorted-array/description/
class Solution {
    public int singleNonDuplicate(int[] nums) {        
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int mid  = (i+j)/2;
            if((mid%2 == 0 && nums[mid] == nums[mid+1]) ||( mid-1>=0 && mid%2!=0 && nums[mid] == nums[mid-1]) )i = mid+1;
            else j = mid;            
        }
        return nums[i];
    }
}
// EXPLANATION :- 
// In this question basically i play around the indexes as the array is sorted and where every element appears exactly twice, except for one element which appears exactly once. 
// so if i look into the indexing of normal sorted array having every element twice [1,1,2,2,3,3] then i can observe that 1st element is at  even indx while the 2nd is at odd indx if this rules/logic breaks then i can tell that the first part from i to mid my answer lie if not then ans is lieing on the other half from mid to j so applying this logic i write the above solution...   