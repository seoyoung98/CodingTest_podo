def solution(s):
    answer = ''
    s_len = len(s)
    # 홀수 +1,
    if (s_len % 2 == 0): # 짝수
        for i in range((s_len // 2)-1,(s_len // 2)+1):
            answer += s[i]
        return answer
    else: # 홀수
        return s[s_len // 2]