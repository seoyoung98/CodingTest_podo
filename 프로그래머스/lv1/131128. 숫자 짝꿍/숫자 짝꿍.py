'''
두 정수 x,y의 임의의 자리에서 공통으로 나타나는 정수들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라고 한다.
공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용
x,y의 짝꿍이 존재하지 않으면 -1 리턴

문자열로 반환하기
'''
def solution(X, Y):
    answer = []
    x_lst = [0] * 10 # 0으로 채워진 10개의 리스트 생성
    y_lst = [0] * 10
    
    for i in range(len(X)): # X의 길이 동안 
        x_lst[int(X[i])] += 1 # 해당 숫자의 위치에 1 더하기
    for i in range(len(Y)):
        y_lst[int(Y[i])] += 1
        
    for i in range(9,-1,-1):
        if((x_lst[i] > 0) & (y_lst[i] > 0)):
            num = i
            n = min(x_lst[i],y_lst[i])
            for k in range(n):
                answer.append(str(num))
        
    if len(answer) == 0:
        return '-1'
    elif len(answer) == answer.count('0'):
        return '0'
    else:
        return ''.join(answer)