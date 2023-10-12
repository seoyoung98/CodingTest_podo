# def solution(n):
#     result = 0
#     num_list = [] 
#     for i in range(1, n+1):
#         num_list.append(i) # 요기에 일단 다 들어감
    
#     for i in range(1,n+1):
#         for j in range(0,n-i+1):
#             if(sum(num_list[j:j+i]) == n):
#                 result += 1
#     return result 


def solution(n):
    result = 0
    for i in range(1, n+1):
        sum = 0
        while sum < n:
            sum += i
            if(sum == n):
                result += 1
                break
            i += 1
    return result
                