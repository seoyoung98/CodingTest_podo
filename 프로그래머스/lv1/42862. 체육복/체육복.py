def solution(n, lost, reserve):
    # 겹치는 숫자 제거, set은 정렬이 된다.
    lost_2 = list(set(lost) - set(reserve))
    reserve_2 = list(set(reserve) - set(lost))
    
    # lost_2 안에서 돌면서 
    for i in range(len(lost_2)):
        num = lost_2[i]
        if(len(lost_2) == 0): break
        if (num - 1) in reserve_2: # lost_2 -1 이 
            reserve_2.remove(num - 1)
        elif (num + 1) in reserve_2:
            reserve_2.remove(num + 1)
        else:
            n -= 1
    return n