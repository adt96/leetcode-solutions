class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n=len(nums)
        for i in range(0,n+1):
            if i not in nums:
                return i
        return 0
