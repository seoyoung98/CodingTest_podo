n, m = map(int, input().split())

basket = [0] * n
# a,b,c = map(int, input().split())
# for i in range(a+1, b+1):
#     basket[i-1] = c
for _ in range(m):
    i, j, k = map(int, input().split())
    for z in range(i, j + 1):
        basket[z-1] = k

print(' '.join(map(str, basket)))