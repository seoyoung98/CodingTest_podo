def solution(price, money, count):
    # 부족한 금액 return
    sum = 0
    for i in range(1,count+1):
        sum += price * i
    if (money > sum):
        return 0
    else:
        return sum - money