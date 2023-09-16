def solution(n):
    n = list(map(int,str(n)))
    answer = []
    for i in range(len(n)-1,-1,-1):
        answer.append(n[i])
    return answer