test = int(input())

for _ in range(test):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    between = pow(pow(abs(x2-x1),2) + pow(abs(y2-y1),2),0.5)

    if between == 0 and r1 == r2:
        print(-1)
    elif abs(r1-r2) == between:
        print(1)
    elif r1+r2 == between:
        print(1)
    elif abs(r1 - r2) < between < r1 + r2:
        print(2)
    else:
        print(0)