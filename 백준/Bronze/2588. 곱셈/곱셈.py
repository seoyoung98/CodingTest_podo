a = input()
b = input()
b_list = list(b)

for i in range(3):
    print(int(a) * int(b_list[2-i]))
print(int(a) * int(b))