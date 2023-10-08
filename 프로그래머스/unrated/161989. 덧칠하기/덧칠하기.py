def solution(n, m, section):
    answer = 1
    new_paint = section[0]
    for i in section:
        # 칠할 수 있다면 넘어가고
        if new_paint + (m-1) < i:  # 페인트를 칠할 수 없다면, 범위를 벗어난 것 
            new_paint = i  # 칠할 수 없으니까 새롭게 업데이트
            answer += 1
    return answer