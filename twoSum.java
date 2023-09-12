//BRUTE - FORCE O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
                if (nums[i]+nums[j]==target)
                {
                    return new int[] {i,j};
                }
            }

        }
return nums;
    }
}


// USING HASHMAP O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compliments = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {  Integer complimentIndex =compliments.get(nums[i]);
           if(complimentIndex != null)
           {
               return new int[] {i, complimentIndex};
           }
           compliments.put(target- nums[i], i);
        }
        return nums;
    }
}
