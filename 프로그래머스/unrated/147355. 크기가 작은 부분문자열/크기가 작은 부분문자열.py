def solution(t, p):
    count = 0
    for i in range(0,len(t)-len(p)+1):
        t_num = t[i:i+len(p)]
        p_num = p
        if(t_num <= p_num):
            count += 1
    return count


'''
숫자 문자열 t, p
t에서 p와 길이가 같은 부분 문자열
부분 문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은것이 나오는 횟수 return 

'''