n = int(input())
height = list(map(int, input().split()))

line = [0] * n

for i in range(n):
    zero = 0
    for j in range(n):
        if zero == height[i] and line[j] == 0:
            line[j] = i + 1
            break
        elif line[j] == 0:
            zero += 1

print(' '.join(map(str, line)))