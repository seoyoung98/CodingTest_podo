import sys
import math

input = sys.stdin.readline
n = int(input())

student = list(map(int, input().split()))

b, c = map(int, input().split())

teacher = 0

for i in range(n):
    student[i] -= b
    teacher += 1
    if student[i] > 0:
        teacher += math.ceil(student[i] / c)
        # print(student[i]/c, math.ceil(student[i] / c))

print(teacher)