def solution(s):
    count = [0,0]
    while s != "1":
        count[1] += s.count("0")
        s = s.replace("0","")
        count[0] += 1
        s = str(bin(len(s))[2:])
    return count

        
# def solution(s):
#     count_step = 0
#     count_zero = 0
#     while s != "1":
#         count_zero += s.count("0")  # 0의 개수 업데이트
#         s = s.replace("0", "")  # 0 제거
#         count_step += 1
#         s = str(bin(len(s))[2:])
            
#     return [count_step, count_zero]
