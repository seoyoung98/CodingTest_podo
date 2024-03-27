a, b = map(int, input().split())
perm_list = [0] * b

def dfs(count):
    if count == b:
        print(' '.join(map(str, perm_list)))
        return
    for i in range(1, a+1):
        perm_list[count] = i
        dfs(count + 1)

dfs(0)