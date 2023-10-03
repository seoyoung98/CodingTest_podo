'''
=> 에라토스테네스의 체 - 대량의 소수를 한 번에 판별하는 데 사용
1. 배열 생성, True로 값 초기화
2. 2부터 시작해서 특정 숫자의 배수에 해당하는 숫자 지우기(특정 숫자는 지우지 말기)
3. 이미 지워진 숫자의 경우는 건너뛰기 (True인 경우만 실행)
4. 2부터 남아있는 숫자를 출력
'''

import math
def solution(n):
    answer = 0
    array = [True for i in range(n+1)]
    
    for i in range(2, int(math.sqrt(n))+1):
        if(array[i] == True):
            j = 2 # j는 2부터 시작
            while i * j <= n:
                # 배수가 있으면 소수가 아니므로 False로 바꿔준다.
                array[i*j] = False
                j += 1
    for i in range(2, n+1):
        if array[i]:
            answer += 1
    
    return answer
