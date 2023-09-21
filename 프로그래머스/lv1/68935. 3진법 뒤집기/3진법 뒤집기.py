def solution(n):
    n = str(n) # 문자로 바꾸기
    answer = num_3(n) # 3진법으로 바꾸기
    reverse_answer = "" # 빈 문자열 만들기
    for i in range(len(answer)-1,-1,-1): # 3진법 거꾸로 돌리기
        reverse_answer += answer[i] # 집어넣기
    answer_10 = int(reverse_answer,3) # 다시 10진법으로 바꾸기
    return answer_10

def num_3(n):
    n = int(n)
    answer = ""
    while n > 0:
        n, mod = divmod(n,3)
        answer += str(mod)
    return answer[::-1]
    