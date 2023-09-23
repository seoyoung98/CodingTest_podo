'''
체격 순
앞번호 학생이나 뒷번호 학생에게만 빌려줄 수 있다.
최대한 많은 학생이 체육 수업을 듣게 하라
n 전체 학생의 수
lost 도난 학생 배열
reserve 여벌 학생 배열 

만약 여벌 체육복이 있는 학생이 도난을 당했다면 빌려줄 수 없다.
'''
'''
def solution(n, lost, reserve):
    lost_2 = [l for l in lost if l not in reserve]
    reverse_2 = [r for r in lost if r not in reserve]
    for i in lost_2:
        elif (i-1) in reserve_2:
            reserve_2.remove(i-1)
        elif (i+1) in reserve_2:
            reserve_2.remove(i+1)
        else:
            n -= 1
            
    return n
'''
def solution(n, lost, reserve):
    _reserve = [r for r in reserve if r not in lost]
    _lost = [l for l in lost if l not in reserve]
    _lost.sort()
    _reserve.sort()
    for r in _reserve:
        f = r - 1
        b = r + 1
        if f in _lost:
            _lost.remove(f)
        elif b in _lost:
             _lost.remove(b)
    return n - len(_lost)