def solution(rny_string):
    answer = ''
    rList = list(rny_string)
    for i in rList:
        if i == "m":
            answer += "rn"
        else:
            answer += i
    return answer