def solution(a, b):
    answer = 0
    if a > b:
        max = a
        min = b
    else:
        max = b
        min = a
    for i in range(min, max+1):
        answer += i
    return answer