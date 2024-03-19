import math

test = int(input())

for _ in range(test):
    a, b = map(int, input().split(' '))
    print(math.comb(b, a))

'''
시간 초과,, list까지 만들어야 하니까 많이 오래 걸린다.
from itertools import combinations
import sys

input = sys.stdin.readline
test = int(input())

for _ in range(test):
    a, b = map(int, input().split())
    b_list = list()
    for i in range(1, b+1):
        b_list.append(i)
    combi = list(combinations(b_list, a))
    print(len(combi))
'''