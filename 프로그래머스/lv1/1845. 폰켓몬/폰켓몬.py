def solution(nums):
    pick_mon = len(nums)//2 # 가져갈 수 있는 개수 
    set_nums = list(set(nums))
    
    
    
    return min(len(set_nums),pick_mon)