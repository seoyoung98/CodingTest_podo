def solution(my_string):
    answer = ''
    myStrList = list(my_string)
    aeiou = ["a","e","i","o","u"]
    myStrList = [i for i in myStrList if i not in aeiou]
    return ''.join(myStrList)