'''
마이너스도 같이 묶어야 한다.
'''

def solution(s):
    answer = ""
    s = list(map(int,s.split(" ")))
    min_n = str(min(s))
    blank = " "
    max_n = str(max(s))
    answer = min_n + blank + max_n
    return answer