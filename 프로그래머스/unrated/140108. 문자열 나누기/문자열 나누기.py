def solution(s):
    result = 0 # 결과
    sum_v = 0 # 빠진 길이 수
    x_count = 0 # 해당 알파벳 수
    else_count = 0 # 해당 알파벳이 아닌 수
    a = 0 # 또 다른 인덱스 
    x = s[a]
    for en in s:
        if(((x_count > 0) & (else_count > 0)) & (x_count == else_count)):
            result += 1
            sum_v += x_count
            x_count = 0
            else_count = 0
            if(a < len(s)-1):
                x = s[a+1]
            else:
                break
        if(en == x):
            x_count += 1
            a += 1
        elif(en != x):
            else_count += 1
            a += 1
    if(sum_v == len(s)):
        return result
    else:
        return result + 1
