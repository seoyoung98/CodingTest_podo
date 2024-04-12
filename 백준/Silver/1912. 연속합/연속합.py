n = int(input())

arr = list(map(int, input().split()))

dp = [0] * n
dp[0] = arr[0]

for i in range(1, n):
    dp[i] = max(arr[i], dp[i-1] + arr[i])
print(max(dp))

# 시간 초과
# sum_arr = []

# for i in range(n):
#     for cnt in range(n-i):
#         # print(arr[i:i+cnt+1])
#         # print(sum(arr[i:i+cnt+1]))
#         sum_arr.append(sum(arr[i:i+cnt+1]))

# print(max(sum_arr))