a, b = map(int, input().split())
a_list = list(str(a))
b_list = list(str(b))

a_min = [0]*len(a_list)
a_max = [0]*len(a_list)
b_min = [0]*len(b_list)
b_max = [0]*len(b_list)

for i in range(len(a_list)):
    if a_list[i] == '5':
        a_max[i] = '6'
        a_min[i] = '5'
    elif a_list[i] == '6':
        a_max[i] = '6'
        a_min[i] = '5'
    else:
        a_max[i] = a_list[i]
        a_min[i] = a_list[i]

for i in range(len(b_list)):
    if b_list[i] == '5':
        b_max[i] = '6'
        b_min[i] = '5'
    elif b_list[i] == '6':
        b_max[i] = '6'
        b_min[i] = '5'
    else:
        b_max[i] = b_list[i]
        b_min[i] = b_list[i]

print(str(int(''.join(a_min))+int(''.join(b_min))) + " " + str(int(''.join(a_max))+int(''.join(b_max))))