from collections import deque

n, m = map(int, input().split())

miro_map = []

for _ in range(n):
    row = list(map(int, input())) # int로 받기 힘들었다,,!
    miro_map.append(row)

# print(miro_map)

check = deque([[0, 0]])

#상 하 좌 우
direction = [[0,1],[0,-1],[-1,0],[1,0]]

while check:
    standard = check.popleft()
    # print("hello",standard)
    x = standard[1]
    y = standard[0]
    for i in range(4):
        nx = x + direction[i][0]
        ny = y + direction[i][1]
        
        if 0 <= nx < m and 0 <= ny < n: # 범위 설정 똑바로 해야한다
            if miro_map[ny][nx] == 1:
                check.append([ny, nx])
                miro_map[ny][nx] = miro_map[y][x] + 1

print(miro_map[n-1][m-1])
