def solution(my_string):
    # answer = ''
    # myStrList = list(my_string)
    # myStrList.reverse()
    # answer = ''.join(myStrList)
    
    # 1.
    # for i in range(len(myStrList)-1,-1,-1):
    #     answer += myStrList[i]
    
    # 2.
    # myStrList.reverse()
    # answer = ''.join(myStrList)
    
    return my_string[::-1]