from collections import deque

subin, sudong = map(int, input().split())

visited = deque([subin])
visited_list = [0] * (100000 + 1)

count = 0
while visited:
    standard = visited.popleft()
    if standard == sudong:
        print(visited_list[standard])
        break
    
    # print("기준" + str(standard))
    for i in (standard + 1, standard - 1, standard *2):
        if (0 <= i < 100001) and not visited_list[i]:
            visited_list[i] = visited_list[standard] + 1
            visited.append(i)
            
    # print("count 됨")
    count += 1