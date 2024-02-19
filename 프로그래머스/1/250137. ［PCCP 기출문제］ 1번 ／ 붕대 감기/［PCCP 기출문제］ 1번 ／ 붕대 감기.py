'''
붕대 감기 t초, 1초 x만큼 체력 회복
t초 연속 성공 후 +y만큼 체력 추가
최대보다 커지는 것은 불가능

기술 도중 공격 당하면 기술 취소, 
공격 당하는 순간 체력 회복 불가

기술이 취소당하거나 기술이 끝나면 즉시 붕대 감기 사용
연속 성공 시간 0으로 초기화

체력 0이하면 체력 회복 불가능
'''

def solution(bandage, health, attacks):
    answer = health
    last_attack = attacks[-1][0]
    idx = 0 
    count = 0 # 연속 성공 횟수 
    for i in range(1,last_attack + 1):
        if idx < len(attacks) and i == attacks[idx][0]: # 공격을 당했을 때 
            answer -= attacks[idx][1]
            idx += 1
            count = 0
            if answer <= 0:
                return -1
            
        else: # 회복하는 단계
            answer += bandage[1]
            count += 1
            if count == bandage[0]:
                answer += bandage[2]
                count = 0
            if answer >= health: 
                answer = health
            
    
    return answer