import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

arr = deque()

for i in range(n):
    arr.append(i+1)

while True:
    if n == 1:
        break
    else:
        arr.popleft()
        if len(arr) == 1:
            break
        a = arr.popleft()
        arr.append(a)

print(arr[0])