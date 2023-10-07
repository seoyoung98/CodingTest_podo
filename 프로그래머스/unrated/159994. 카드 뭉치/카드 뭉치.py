def solution(cards1, cards2, goal):
    for i in goal: # 앞자리만 계속 빼주기 
        if cards1 and i == cards1[0]: # cards1이 비어있지 않고 첫 째가 일치하면
            del cards1[0] # del 이 인덱스로 삭제, remove는 값으로 삭제 
        
        elif cards2 and i == cards2[0]:
            del cards2[0]

        else:
            return 'No'
    return 'Yes'