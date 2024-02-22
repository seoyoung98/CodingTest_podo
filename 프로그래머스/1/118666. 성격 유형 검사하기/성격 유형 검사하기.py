def solution(survey, choices):
    answer = ''
    personality = ['R','T','C','F','J','M','A','N']
    score = [0] * 8
    
    for i in range(len(choices)):
        if choices[i] == 1:
            idx = personality.index(survey[i][0]) 
            score[idx] += 3
        elif choices[i] == 2:
            idx = personality.index(survey[i][0]) 
            score[idx] += 2
        elif choices[i] == 3:
            idx = personality.index(survey[i][0]) 
            score[idx] += 1
        elif choices[i] == 5:
            idx = personality.index(survey[i][1]) 
            score[idx] += 1
        elif choices[i] == 6:
            idx = personality.index(survey[i][1]) 
            score[idx] += 2
        elif choices[i] == 7:
            idx = personality.index(survey[i][1]) 
            score[idx] += 3
    answer += find(personality[0:2], score[0:2])
    answer += find(personality[2:4], score[2:4])
    answer += find(personality[4:6], score[4:6])
    answer += find(personality[6:], score[6:])
    return answer

def find(personality, score):
    if score[0] > score[1]:
        return personality[0]
    elif score[0] < score[1]:
        return personality[1]
    elif score[0] == score[1]:
        personality.sort()
        return personality[0]
