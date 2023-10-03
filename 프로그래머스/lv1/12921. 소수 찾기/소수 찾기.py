def is_prime(n):
    count = 0
    for i in range(2,int(n**(1/2))+1):
        if(n % i == 0):
            count += 1
            return False
    if(count == 0):
        return True

def solution(n):
    answer = 0
    for i in range(2,n+1):
        if(is_prime(i) == True):
            answer += 1
    
    return answer