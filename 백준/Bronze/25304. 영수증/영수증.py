real = int(input())
n = int(input())

card = 0

for _ in range(n):
    item, price = map(int, input().split())
    card += item * price

if real == card:
    print("Yes")
else:
    print("No")