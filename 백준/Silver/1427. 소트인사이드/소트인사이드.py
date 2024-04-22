num = list(map(int, input()))
num = sorted(num, reverse=True)

print(''.join(map(str, num)))