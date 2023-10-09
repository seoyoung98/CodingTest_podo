def solution(ingredient):
    answer = 0
    ham = [1, 2, 3, 1]
    stack = []

    for i in range(len(ingredient)):
        stack.append(ingredient[i])
        if stack[-4:] == ham:
            del stack[-4:]
            # del이 속도가 아주 살짝 빠른 것 같다ㅏ
            # for j in range(4):
                # stack.pop()
            answer += 1
    return answer
