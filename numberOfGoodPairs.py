class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        import math
        nums.sort()
        res =0
        s = set(nums)
        for i in s:
            res += math.comb(nums.count(i),2)
        return res

        
        