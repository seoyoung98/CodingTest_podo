import sys
input = sys.stdin.readline
n, m = map(int, input().split())

basket = [0] * n

for _ in range(m):
    i, j, k = map(int, input().split())
    for z in range(i, j + 1):
        basket[z-1] = k

print(' '.join(map(str, basket)))