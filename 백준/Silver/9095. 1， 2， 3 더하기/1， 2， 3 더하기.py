test_case = int(input())

for i in range(test_case):
    n = int(input())
    n_list = [0]*11

    for j in range(1, n+1):
        if j == 1:
            n_list[j] = 1
        elif j == 2:
            n_list[j] = 2
        elif j == 3:
            n_list[j] = 4
        else:
            n_list[j] = n_list[j-1] + n_list[j-2] + n_list[j-3]
    
    print(n_list[n])