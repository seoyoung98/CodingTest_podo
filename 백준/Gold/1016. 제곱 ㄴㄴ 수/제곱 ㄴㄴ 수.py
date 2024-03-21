min, max = map(int, input().split())

# min : 15, max : 15
inter = max - min + 1

inter_list = [False] * inter

for i in range(2, int((max**0.5) + 1)):
    square = i ** 2
    # 14//4 = 3
    for j in range((((min-1)//square)+1)*square, max+1, square):
        if not inter_list[j - min]:
            inter_list[j- min] = True
            inter -= 1
    # for j in range(min, max+1):
    #     if (j % square == 0) and (inter_list[j-min] == False):
    #         inter_list[j-min] = True
    #         inter -= 1

print(inter)

'''
어떤 정수 x가 1보다 큰 제곱수로 나누어 떨어지지 않을 때, 그 수를 제곱ㄴㄴ수

파이썬 제곱 수 확인
sqrt = n ** (1/2)

if sqrt % 1 == 0:
    return True
else:
    return False

범위 내의 수를 제곱수로 나눠떨어지는 지를 조사한 후 카운트
이미 카운트한 수는 True를 할당
'''