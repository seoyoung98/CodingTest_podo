test = int(input())

for _ in range(test):
    n = int(input())
    n_list = [0] * (n + 1)
    for i in range(n+1):
        if i == 0:
            n_list[i] = 0
        elif i == 1:
            n_list[i] = 1
        else:
            n_list[i] = n_list[i-1] + n_list[i-2]
    if n == 0:
        print("1 0")
    elif n == 1:
        print("0 1")
    else:
        print(str(n_list[n-1]) + " " + str(n_list[n]))



'''
         0 1
0 : 0 -> 1 0
1 : 1 -> 0 1
2 : 1 -> 1 1
3 : 2 -> 1 2
4 : 3 -> 2 3
5 : 5-> 3 5
6 : 8 -> 5 8
7 : 13 -> 8 13
8 : 21 -> 13 21
9 : 34 -> 21 34
10 -> 34 55
'''