def solution(n):
    move = 1
    while(n > 1):
        if(n%2==0):
            n = n/2
        else:
            n = n-1
            move += 1
    return move