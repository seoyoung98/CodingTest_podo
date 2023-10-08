from itertools import combinations

def condition(n):  # 소수 판별
    b = 0
    for i in range(2, n):
        if n % i == 0:
            b += 1
            break
    if b == 0:
        return True
    else:
        return False


def solution(nums):
    answer = 0

    comb = list(combinations(nums, 3))

    for i in range(len(comb)):
        if (condition(sum(comb[i])) == True):
            answer += 1

    return answer