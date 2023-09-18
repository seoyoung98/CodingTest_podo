def solution(absolutes, signs):
    for i in range(len(absolutes)):
        if(signs[i] == True):
            absolutes[i] *= 1
        else:
            absolutes[i] *= -1
    return sum(absolutes)