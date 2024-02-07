def solution(n):
    answer = 0
    nList = list(str(n))
    for i in nList:
        answer += int(i)
    return answer