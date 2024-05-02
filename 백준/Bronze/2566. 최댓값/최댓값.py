table = [list(map(int, input().split())) for _ in range(9)]

max_num = 0
row, col = 0, 0

for i in range(9):
    for j in range(9):
        if table[i][j] >= max_num:
            max_num = table[i][j]
            row = i + 1
            col = j + 1

print(max_num)
print(row, col)