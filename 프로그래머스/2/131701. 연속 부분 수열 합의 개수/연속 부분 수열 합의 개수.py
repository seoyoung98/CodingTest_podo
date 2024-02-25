# 미친 시간초과
def solution(elements):
    answer = set()
    double = elements * 2
    idx = 1
    for i in range(len(elements)):
        if idx > len(elements):
                break
        for j in range(len(elements)):
            n_sum = sum(double[j:j+idx])
            answer.add(n_sum)
        idx += 1
    return len(answer)