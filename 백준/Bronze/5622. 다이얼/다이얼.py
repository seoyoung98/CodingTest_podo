import sys
input = sys.stdin.readline

phone = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

s = input()

answer = 0

for i in range(len(s)):
    for j in phone:
        if s[i] in j:
            answer += phone.index(j) + 3

print(answer)