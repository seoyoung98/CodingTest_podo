from collections import deque

def bfs(v):
    check = deque([v])
    bfs_check[v] = 1
    while check:
        standard = check.popleft()
        for i in range(1, len(graph)):
            if bfs_check[i] == 0 and graph[standard][i]:
                check.append(i)
                bfs_check[i] = 1

computer = int(input())
network = int(input())

graph = [[False] * (computer + 1) for _ in range(computer + 1)]

for _ in range(network):
    a, b = map(int, input().split(' '))
    graph[a][b] = True
    graph[b][a] = True
bfs_check = [0] * (computer + 1)

bfs(1)
answer = 0
for i in bfs_check:
    if i == 1:
        answer += 1
print(answer-1)