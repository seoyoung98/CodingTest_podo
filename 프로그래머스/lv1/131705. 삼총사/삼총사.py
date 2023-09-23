'''
학생들 각자 정수 번호
학생 3명의 정수 번호를 더했을 때 0이면 3명은 삼총사
삼총사가 될 경우의 수를 출력
'''
from itertools import *
def solution(number):
    answer = 0
    n_lst = list(combinations(number, 3))
    for i in range(len(n_lst)):
        if sum(n_lst[i]) == 0:
            answer += 1
    return answer

