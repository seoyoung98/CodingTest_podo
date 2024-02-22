def solution(s):
    answer = True
    stack = []
    for i in range(len(s)):
        stack.append(s[i])
        if stack[-2:] == ['(',')']:
            stack.pop()
            stack.pop()
            
    if len(stack) > 0:
        answer = False
    return answer

# def solution(s):
#     answer = True
#     stack= []
#     for i in range(len(s)):
#         stack.append(s[i])
#         if(stack[-2:] == ['(', ')']):
#             stack.pop()
#             stack.pop()
#     if(len(stack) == 0):
#         return True
#     else:
#         return False