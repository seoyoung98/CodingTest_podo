from collections import deque

direction = [[-1,0],[1,0],[0,-1],[0,1]]

def virus():
    check = deque()
    virus_map = [row[:] for row in my_map]
    for i in range(n):
        for j in range(m):
            if virus_map[i][j] == 2:
                check.append([i, j])
    
    while check:
        standard = check.popleft()

        for d in direction:
            x = standard[0] + d[0]
            y = standard[1] + d[1]

            if (0 <= x < n) and (0 <= y < m) and virus_map[x][y] == 0:
                virus_map[x][y] = 2
                check.append([x,y])

    global answer
    zero_cnt = sum(row.count(0) for row in virus_map)
    answer = max(answer, zero_cnt)


def wall(cnt):
    if cnt == 3:
        virus()
        return
    else:
        for i in range(n):
            for j in range(m):
                if my_map[i][j] == 0:
                    my_map[i][j] = 1
                    wall(cnt + 1)
                    my_map[i][j] = 0

n, m = map(int, input().split())
my_map = [list(map(int, input().split())) for _ in range(n)]

answer = 0

wall(0)
print(answer)