'''
문자열 s 
각 위치마다 앞에 나오고, 자신과 가장 가까운 곳에 있는 같은 글자(뒤에서부터 비교하기)

'''
def solution(s):
    answer = []
    answer.append(-1)
    for i in range(1,len(s)): # 1부터 s까지
        if(s[i] not in s[0:i]):
            answer.append(-1)
        else:
            for j in range(i-1,-1,-1):
                if(s[i] == s[j]):
                    answer.append(i-j)
                    break
                else:
                    continue
        
    return answer