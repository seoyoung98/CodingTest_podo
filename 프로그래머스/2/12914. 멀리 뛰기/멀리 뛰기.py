'''
규칙을 찾아보자!!

fact[n] = fact[n-1] + fact[n-2]
'''

def solution(n):
    n_list = [0] * (n+1)
    
    if n == 1:
        return 1
    elif n == 2:
        return 2
    elif n >= 3:
        n_list[1] = 1 
        n_list[2] = 2 
        for i in range(3, n+1):
            n_list[i] = (n_list[i-1] + n_list[i-2]) % 1234567
        return n_list[n]
        