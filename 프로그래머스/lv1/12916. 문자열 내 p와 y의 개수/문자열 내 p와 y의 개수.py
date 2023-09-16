def solution(s):
    s = s.lower()
    s = list(s)
    p_count = 0
    y_count = 0
    for i in range(len(s)):
        if(s[i] == 'p'):
            p_count += 1
        elif(s[i] == 'y'):
            y_count += 1 
    if(p_count == y_count):
        return True
    else:
        return False