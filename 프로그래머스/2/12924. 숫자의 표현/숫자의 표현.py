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

# 시벌 효율성 문제가 제일 싫다ㅏㅏ
# 일단 for문을 2개 돌렸다는 것 부터 미친 짓이고
# 리스트도 따로 만들지 않아도 된 듯,,
# 최대한 어떤 식으로 문제를 풀지를 먼저 생각하고 풀어야겠다

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
                
