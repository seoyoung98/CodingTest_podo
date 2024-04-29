from collections import deque

n = int(input())
dummy = [[0]*(n) for _ in range(n)]

apple_num = int(input())

for _ in range(apple_num):
    a, b = map(int, input().split())
    dummy[a-1][b-1] = 1

direction_num = int(input())
time_dir = [0] * 10001
for _ in range(direction_num):
    time, dir = input().split()
    time_dir[int(time)] = dir

x = 0
y = 0
times = 0

# 동 남 서 북
dx = [0, 1, 0, -1]
dy = [1, 0, -1,0]
idx = 0

warm = deque([[0, 0]])

while True:
    times += 1
    x += dx[idx]
    y += dy[idx]

    if (x >= n or y >= n or x < 0 or y < 0) or ([x,y] in warm):
        # print("ha", [x,y] in warm)
        break

    warm.append([x, y])
    if dummy[x][y] == 0:
        warm.popleft()
    else:
        dummy[x][y] = 0

    # print(warm)

    if (time_dir[times] == 'D'):
        idx = (idx + 1) % 4
    elif (time_dir[times] == 'L'):
        idx = (idx + 3) % 4

print(times)