length = int(input())
move = list(input())

# 동 남 서 북
direction_idx = [0, 1, 2, 3]
direction_move = [[1,0],[0,-1],[-1,0],[0,1]]

# 남으로 초기화
location = 1

map_map = [["#"]*101 for _ in range(101)]

temp = [50, 50]

min_x = 50
max_x = 50
min_y = 50
max_y = 50

map_map[50][50] = '.'

for i in move:
    if i == 'R':
        location = (location + 1) % 4
    elif i == 'L':
        location = (location - 1) % 4
    elif i == 'F':
        temp[0] += direction_move[location][0]
        temp[1] += direction_move[location][1]
        map_map[temp[0]][temp[1]] = '.'
        min_x = min(min_x, temp[0])
        max_x = max(max_x, temp[0])
        min_y = min(min_y, temp[1])
        max_y = max(max_y, temp[1])

for i in range(max_y, min_y - 1, -1):
    for j in range(min_x, max_x + 1):
        print(map_map[j][i], end="")
    print()