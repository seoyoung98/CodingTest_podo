answer = set()

def self_num(n):
    num = list(str(n))
    su = 0
    for i in range(len(num)):
        su += int(num[i])
    su += n
    return su

for i in range(10000):
    answer.add(self_num(i))

for i in range(1, 10001):
    if i not in answer:
        print(i)