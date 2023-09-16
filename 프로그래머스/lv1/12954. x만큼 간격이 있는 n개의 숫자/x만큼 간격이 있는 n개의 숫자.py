def solution(x, n):
    answer = []
    j = x
    for i in range(n): # 개 도안
        answer.append(j)
        j += x
    return answer