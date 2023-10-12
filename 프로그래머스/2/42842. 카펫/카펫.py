'''
함수를 쓰면 한 번에 나올 듯
일단 노란색 (가로 +2) * 2 + (세로 +2) * 2 - 4 = 갈색 개수  
'''

def solution(brown, yellow):
    answer = []
    list = []
    for i in range(1,yellow+1):
        if(yellow % i == 0):
            if(brown == ((i+2)*2+((yellow//i+2)*2) - 4)):
                list.append(i+2)
                list.append(yellow//i + 2)
                break
    answer.append(max(list))
    answer.append(min(list))
    return answer