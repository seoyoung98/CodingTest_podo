def solution(my_string):
    answer = ''
    myStrList = list(my_string)
    
    for i in range(len(myStrList)-1,-1,-1):
        answer += myStrList[i]
    
    return answer