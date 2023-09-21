def solution(lottos, win_nums):
    result = []
    lottos.sort()
    win_nums.sort()
    if(max(lottos) == 0):
        result_0 = [1,6]
        return result_0
    else:
        count = 0 # 일치하는 개수
        for i in range(6):
            for j in range(6):
                if(lottos[i] == win_nums[j]): # 일치하는 개수 세기
                    count += 1
        count_0 = lottos.count(0) # 0 개수 세기 
        max_num = count + count_0
        result.append(rank(max_num))
        min_num = count
        result.append(rank(min_num))
        return result

def rank(n): # 순위
    if n >= 6:
        return 1
    elif n == 5:
        return 2
    elif n == 4:
        return 3
    elif n == 3:
        return 4
    elif n == 2:
        return 5
    else:
        return 6
'''
일부 번호를 알아볼 수 없게 되었다. 개수는 정해지 않음
구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶다.
당첨 번호가 주어지고 

일단 lottos랑 win_nums 중 일치하는 개수 세고

'''