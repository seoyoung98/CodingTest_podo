'''
짝지어 제거하기
같은 알파벳이 2개 붙어있는 짝 찾아서 제거
스택 이용
'''

def solution(s):
    stack = []
    stack.append(s[0])
    for i in range(1,len(s)):
        stack.append(s[i])
        if((len(stack) >= 2) and (stack[-1] == stack[-2])):
            stack.pop()
            stack.pop()
    if(len(stack) == 0):
        return 1
    else:
        return 0