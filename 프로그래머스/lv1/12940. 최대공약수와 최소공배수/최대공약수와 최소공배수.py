def solution(n, m):
    answer = []
    answer.append(gcd(n,m))
    answer.append(lcm(n,m))
    return answer

def gcd(n,m): # 최대공약수
    answer = 0
    for i in range(min(n,m),0,-1):
        if((m % i == 0) & (n % i == 0)):
            answer = i
            break;
    return answer
    
def lcm(n,m): # 최소공배수
    answer = 0
    for i in range(max(n,m),n*m+1,1):
        if((i % n == 0) & (i % m == 0)):
            answer = i
            break;
    return answer
    
    
    
    