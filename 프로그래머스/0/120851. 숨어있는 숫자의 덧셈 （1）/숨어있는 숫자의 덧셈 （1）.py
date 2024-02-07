def solution(my_string):
    answer = 0
    myList = list(my_string)
    for i in myList:
        if i.isdigit():
            answer += int(i)
    return answer