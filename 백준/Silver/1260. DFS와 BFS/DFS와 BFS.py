from collections import deque

def dfs(v):
    # print("여기는 dfs")
    dfs_check[v] = 1
    print(v, end=" ")
    for i in range(1, len(graph)):
        if dfs_check[i] == 0 and graph[v][i]:
            dfs(i)

def bfs(v):
    # print("여기는 bfs")
    check = deque([v])
    bfs_check[v] = 1
    while check:
        standard = check.popleft()
        print(standard, end=" ")
        for i in range(1, len(graph)):
            if bfs_check[i] == 0 and graph[standard][i]:
                check.append(i)
                bfs_check[i] = 1

n, m, v = map(int, input().split())

graph = [[False] * (n+1) for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a][b] = True
    graph[b][a] = True

dfs_check = [0] * (n+1)
bfs_check = [0] * (n+1)

dfs(v)
print()
bfs(v)