def solution(n):
    fi_list = [0,1]
    for i in range(2,n+1):
        fi_list.append((fi_list[i-2]+fi_list[i-1])%1234567)
    return fi_list[n]

# def solution(n):
#     now_num = 0
#     next_num = 1
#     for i in range(0,n):
#         now_num, next_num = next_num, now_num + next_num
#     return now_num