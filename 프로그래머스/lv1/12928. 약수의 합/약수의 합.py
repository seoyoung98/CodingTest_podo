def solution(n):
    # 약수 구하기
    n_lst = []
    for i in range(1,n+1):
        if n % i == 0:
            n_lst.append(i)
    answer = sum(n_lst)
    return answer