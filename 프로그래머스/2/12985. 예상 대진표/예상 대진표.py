def solution(N, A, B):
    answer = 0
    num = [A, B]
    num.sort()  # 일단 넣어서 정렬

    small = num[0]
    big = num[1]

    while not (small % 2 == 1 and big % 2 == 0 and small+1 == big):
        small = small // 2 + small % 2
        big = big // 2 + big % 2
        answer += 1

    return answer + 1