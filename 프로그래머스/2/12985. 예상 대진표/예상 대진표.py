def solution(N, A, B):
    answer = 0
    num = [A, B]
    num.sort()  # 일단 넣어서 정렬

    small = num[0]
    big = num[1]

    while True:
        if(small % 2 == 1 and big % 2 == 0 and small+1 == big):
            break
        if small % 2 == 0: # 짝수면 
            small = small // 2
        else: # 홀수면
            small = small // 2 + 1
        if big % 2 == 0:
            big = big // 2
        else:
            big = big // 2 + 1
        answer += 1

    return answer + 1