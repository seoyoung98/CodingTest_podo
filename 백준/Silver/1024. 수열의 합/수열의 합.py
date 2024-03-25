n, l = map(int, input().split())

answer = False

for i in range(l,101):
    x = (n - i*(i + 1) // 2) / i
    if x == int(x) and x+1 >= 0:
        x = int(x)
        if x + i <= n:
            answer = True
            print(*(i for i in range(x+1, x+i+1)))
            break

if not answer:
    print(-1)


# 시간 초과 코드인 줄 알았는데 걍 틀림
# for i in range(l,n):
#     for j in range(1, n):
#         if (i+1) * (i+j+j)/2 == n:
#             list_num = [str(x) for x in range(j, i+j+1)]
#             print(' '.join(list_num))
#             exit()

# if len(list_num) == 0:
#     print(-1)
