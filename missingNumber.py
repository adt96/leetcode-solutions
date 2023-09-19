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

"""
JAVA SOLUTION
Arrays.sort(nums);
int n= nums.length;
for(int i=0;i<n+1;i++)
{
int res= Arrays.binarySearch(nums,i);
boolean test = res >= 0 ? true: false;
if(test==false)
{
return i;
}
}
return 0
"""
