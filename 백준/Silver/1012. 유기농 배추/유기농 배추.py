from collections import deque 

test = int(input())

for _ in range(test):
    width, length, warm = map(int, input().split())
    cabbage = [[0] * length for _ in range(width)]
    cabbage_list = []
    
    count = 0
    
    for i in range(warm):
        a, b = map(int, input().split())
        cabbage[a][b] = 1
        cabbage_list.append([a,b])
    cabbage_list.sort()

    def direction(width, length, standard):
        direction_list = list()
        x = standard[0]
        y = standard[1]
        if x-1 >= 0:
            direction_list.append([x-1, y])
        if x+1 <= width:
            direction_list.append([x+1, y])
        if y-1 >= 0:
            direction_list.append([x, y-1])
        if y+1 <= length:
            direction_list.append([x, y+1])
        return direction_list

    for i in cabbage_list:
        if cabbage[i[0]][i[1]] == 1:
            cabbage_check = deque([i])
            # print(cabbage_check)

            while cabbage_check:
                standard = cabbage_check.popleft()
                # print("화깅", standard)
                cabbage[standard[0]][standard[1]] = 0

                for j in direction(width, length, standard):
                    if j in cabbage_list and cabbage[j[0]][j[1]] == 1:
                        cabbage_check.append([j[0],j[1]])
                        cabbage[j[0]][j[1]] = 0
                        # print(cabbage)
            # print("================")
            count += 1
        else:
            continue
            
    print(count)