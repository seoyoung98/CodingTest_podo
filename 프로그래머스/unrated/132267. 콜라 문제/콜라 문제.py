def solution(a, b, n):
    answer = 0
    while(n >= a): # a 병 미만일 때는 안준디~~
        remain = n % a # 나머지
        quo = n // a # 몫, 나머지 뺌
        answer += quo * b
        n = quo * b + remain
    
    return answer