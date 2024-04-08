n, d = map(int, input().split())

# [start, destination, [length1, length2]]

arr = []

for i in range(n):
    arr.append(list(map(int, input().split(' '))))

distance = [i for i in range(d+1)]

for i in range(d+1):
    distance[i] = min(distance[i], distance[i-1]+1)
    for start, end, length in arr:
        if i == start and end <= d and distance[i] + length < distance[end]:
            distance[end] = distance[start] + length

print(distance[d])