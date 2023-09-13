class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) < 3:
            return []
        else:
            sum_zero_list = []
            sorted_nums = sorted(nums)
            for i in range(0, len(nums) - 2):
                start = i + 1
                end = len(nums) - 1
                while start < end:
                    curr_sum = sorted_nums[i] + sorted_nums[start] + sorted_nums[end]
                    if curr_sum == 0:
                        zero_triplet = (sorted_nums[i], sorted_nums[start], sorted_nums[end])
                        sum_zero_list.append(zero_triplet)
                        start += 1
                        end -= 1
                    elif curr_sum < 0:
                        start += 1
                    elif curr_sum > 0:
                        end -= 1

            return [list(entries) for entries in set(sum_zero_list)]
