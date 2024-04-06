n = int(input())

step = [0] * 11

step[2] = 1
step[3] = 3

for i in range(4, n + 1):
    mid = i // 2
    step[i] = mid * (i - mid) + step[mid] + step[i - mid]

print(step[n])