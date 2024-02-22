'''
마이너스도 같이 묶어야 한다.
'''

def solution(s):
    number = list(map(int, s.split(" ")))
    number.sort()
    
    return str(number[0]) + " " + str(number[-1])

# def solution(s):
#     answer = ""
#     s = list(map(int,s.split(" ")))
#     min_n = str(min(s))
#     blank = " "
#     max_n = str(max(s))
#     answer = min_n + blank + max_n
#     return answer