sik = input()
sik_div = sik.split('-')

answer = 0
for i in sik_div[0].split('+'):
    answer += int(i)

for s in sik_div[1:]:
    num = 0
    plus_list = s.split('+')
    for p in plus_list:
        num += int(p)
    answer -= num

print(answer)