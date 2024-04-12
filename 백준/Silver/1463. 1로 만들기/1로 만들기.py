n = int(input())

# 다이나믹 프로그래밍
# 그 전까지의 시도를 저장해가면서 효율적ㄱ으로 프로그래밍
small = [0] * (n + 1)

for i in range(2, n+1):
    small[i] = small[i - 1] + 1
    if i % 3 == 0:
        small[i] = min(small[i], small[i // 3] + 1)
    if i % 2 == 0:
        small[i] = min(small[i], small[i // 2] + 1)
print(small[n])