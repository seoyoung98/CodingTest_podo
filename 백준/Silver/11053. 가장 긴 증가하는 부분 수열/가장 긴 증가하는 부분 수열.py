n = int(input())

arr = list(map(int, input().split()))

dp = [1] * n

for i in range(1,len(arr)):
    for j in range(i):
        if arr[i] > arr[j]:
            if dp[j] + 1 > dp[i]:
                dp[i] = dp[j] + 1

print(max(dp))