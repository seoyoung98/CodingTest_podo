'''
각 부서가 신청한 금액만큼을 모두 지원
딱 신청한 금액은 모두 지원해줘야 한다.
신청 금액 배열 d
예산 budget 
결과 - 최대로 지원해 줄 수 있는 부서의 수
'''

def solution(d, budget):
    d.sort() # 정렬
    count = 0
    
    for i in range(len(d)):
        budget -= d[i]
        if(budget < 0):
            return count
        count += 1
    return len(d)