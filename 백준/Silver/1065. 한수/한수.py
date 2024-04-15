def hansu(n):
    flag = True
    length = len(n)
    for i in range(1, length-1):
        if int(n[i-1]) - int(n[i]) == int(n[i]) - int(n[i+1]):
            continue
        else:
            flag = False
            break
    return flag


n = int(input())
cnt = 0
if n <= 99:
    cnt = n
elif n > 99:
    for i in range(1, n+1):
        if hansu(str(i)):
            cnt += 1


print(cnt)