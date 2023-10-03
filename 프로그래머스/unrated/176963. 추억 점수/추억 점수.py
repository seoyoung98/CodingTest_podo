def solution(name, yearning, photo):
    answer = []
    for i in range(len(photo)):
        y_sum = 0
        for j in range(len(photo[i])):
            for k in range(len(name)):
                if(name[k] == photo[i][j]):
                    y_sum += yearning[k]
        answer.append(y_sum)
            
    return answer