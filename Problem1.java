/* Time : O(n)
Space : O(n)
leetcode: Yes
Problem: No

For each number we calculate its difference from target no and put it in hashmap with its index.
 Now in subsequent iterations if we encounter a number which is already there in the hashmap
( due to complement of some other number), we we have got our 2 numbers. The value at this key is the index of the number which
inserted the  complement in map. Hence we return this value and our current index as the answer.
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        
        for(int i =0; i< nums.length; i++)
        {
            
            int complement = target- nums[i];
            
            if(map.containsKey(nums[i]))
            {
                arr[0] = map.get(nums[i]);
                arr[1]= i;
                return arr;
            }
                     
            
            else
                map.put(complement,i);
        }
        
        return arr;
    }
}
