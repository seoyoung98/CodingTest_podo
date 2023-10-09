def solution(ingredient):
    answer = 0
    ham = [1, 2, 3, 1]
    stack = []

    for i in range(len(ingredient)):
        stack.append(ingredient[i])
        if stack[-4:] == ham:
            del stack[-4:]
            answer += 1
    return answer