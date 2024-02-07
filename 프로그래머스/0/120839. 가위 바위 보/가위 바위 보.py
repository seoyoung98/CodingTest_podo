def solution(rsp):
    answer = ''
    rspList = list(rsp)
    for i in rspList:
        if int(i) == 2:
            answer += "0"
        elif int(i) == 5:
            answer += "2"
        else:
            answer += "5"
    return answer