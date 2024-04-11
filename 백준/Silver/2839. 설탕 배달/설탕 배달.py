import sys
input = sys.stdin.readline

kg = int(input())

su = 0

if kg % 5 == 0:
    su = kg // 5
else:
    while kg > 0:
        kg -= 3
        su += 1
        if kg % 5 == 0:
            su += kg // 5
            break
        elif kg == 1 or kg == 2:
            su = -1
            break
        elif kg == 0:
            break

print(su)