def solution(s):
    answer = 0
    for x in range(len(s)):
        list = s[x:] + s[:x]
        stack = []
        stack.append(list[0])
        # print(list)
        for i in range(1,len(list)):
            # print("list[i]", list[i])
            stack.append(list[i])
            check = ''.join(stack[-2:])
            # print("check" + check)
            # print("stack", stack)
            if (len(stack) >= 2) and (check == '[]' or check == '{}' or check == '()'):
                # print("왔니")
                stack.pop()
                stack.pop()
        #     print("last stack => ", stack)
        # print("길이 => ", len(stack))
        if len(stack) == 0:
            answer += 1
        # print("=====================")
            
    return answer