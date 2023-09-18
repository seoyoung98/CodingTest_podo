def solution(x):
    num = x
    x = list(map(int, str(x)))
    sum = 0
    for i in range(len(x)):
        sum += x[i]
    
    if(num % sum == 0):
        return True
    else:
        return False