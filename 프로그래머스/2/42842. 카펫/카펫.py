def solution(brown, yellow):
    answer = []
    list = []
    for i in range(1,yellow+1):
        if(yellow % i == 0):
            if(brown == ((i+2)*2+((yellow//i+2)*2) - 4)):
                list.append(i+2)
                list.append(yellow//i + 2)
    print(list)
    answer.append(max(list))
    answer.append(min(list))
    return answer