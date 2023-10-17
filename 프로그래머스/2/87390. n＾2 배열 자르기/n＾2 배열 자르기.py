'''
i행 i열까지 빈칸만 i로 채운다.
'''
def solution(n, left, right):
    new_list = []
    for i in range(left,right+1):
        x = i // n + 1
        y = i % n + 1
        new_list.append(max(x,y))
    return new_list