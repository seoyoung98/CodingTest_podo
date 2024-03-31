test = int(input())

alpha = {}
alpha_lst = []

for _ in range(test):
    alpha_lst.append(list(input()))

for i in alpha_lst:
    ten = len(i) - 1
    for j in i:
        if j in alpha:
            alpha[j] += pow(10,ten)
        else:
            alpha[j] = pow(10,ten)
        ten -= 1

alpha_sort = sorted(alpha.values(), reverse=True)

#print(alpha_sort)

answer = 0
mul = 9
for i in alpha_sort:
    answer += i * mul
    mul -= 1
print(answer)