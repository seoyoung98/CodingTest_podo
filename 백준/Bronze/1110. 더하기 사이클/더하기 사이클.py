n = int(input())

cycle = 0

changeNum = n

while True:
    ten = changeNum // 10
    one = changeNum % 10
    changeNum = (one * 10) + (ten + one) % 10

    cycle += 1
    if changeNum == n:
        break

print(cycle)