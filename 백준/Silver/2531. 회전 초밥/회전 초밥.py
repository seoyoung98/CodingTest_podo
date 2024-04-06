n, d, k, c = map(int, input().split())

rail = []

for i in range(n):
    rail.append(int(input()))

rail = rail * 2

max_chobap = 0

for i in range(n):
    temp = set(rail[i:i+k])
    temp.add(c)
    max_chobap = max(max_chobap, len(temp))

print(max_chobap)