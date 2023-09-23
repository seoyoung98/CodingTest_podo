'''
학생들 각자 정수 번호
학생 3명의 정수 번호를 더했을 때 0이면 3명은 삼총사
삼총사가 될 경우의 수를 출력
'''
'''
경우의 수를 사용할 수 있는 라이브러리
1. 순열 (Permutation)
순서는 있으나 중복 없는 모든 경우의 수 
n = list(permutations(배열, 개수))
2. 조합 (Combination)
순서는 없고 중복 없는 모든 경우의 수
n = list(combinations(배열, 개수))
3. 중복 순열 (Permutation with repetition)
중복을 허용하는 순열, 같은 값이 나오는 경우를 말한다.
n = list(product(배열, repeat = 개수))
4. 중복 조합 (Combination with repetition)
중복 포함, 순서를 고려하지 않는 경우
n = list(combinations_with_replacement(배열, 개수))
'''
from itertools import *
def solution(number):
    answer = 0
    n_lst = list(combinations(number, 3))
    for i in range(len(n_lst)):
        if sum(n_lst[i]) == 0:
            answer += 1
    return answer

