import sys
input = sys.stdin.readline

n = int(input())

one = 1
stack = []
operation = []

for _ in range(n):
    su = int(input().rstrip())
    while one <= su:
        stack.append(one)
        one += 1
        operation.append('+')
    
    if stack[-1] == su:
        stack.pop()
        operation.append('-')
    else:
        one = 0
        break

if one == 0:
    print('NO')
else:
    for i in operation:
        print(i)