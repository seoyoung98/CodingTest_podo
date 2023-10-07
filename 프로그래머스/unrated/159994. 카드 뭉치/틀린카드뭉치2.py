'''
아예 일치하는 것만 찾으면 안되고 
계속 제일 앞자리 것만 제거해줘야 한다,,
내 코드 넘 길어,,, ㅜㅜ
'''
def solution(cards1, cards2, goal):
    answer = ''
    goal1 = goal[:]
    goal2 = goal[:]
    for i in range(len(cards1)): # goal1 - cards1 => cards2 과 비교
        if(cards1[i] in goal1):
            goal1.remove(cards1[i])
    print(goal1)
            
    for i in range(len(cards2)): # goal2 - cards2 => cards1과 비교
        if(cards2[i] in goal2):
            goal2.remove(cards2[i])
    print(goal2)        

    if((len(goal2) != len(cards1)) | (len(goal1) != len(cards2))): # 길이 비교
        answer += 'No'
        return answer
    else: # 길이가 같으면 비교하기 
        for i in range(len(goal1)):
            for j in range(len(cards2)):
                if(i == j):
                    if(goal1[i] != cards2[j]):
                        answer += 'No'
                        return answer
        if(answer != 'No'): # answer에 아무것도 없다면
            for i in range(len(goal2)): # 또 다시 비교하기
                for j in range(len(cards1)): 
                    if(i == j):
                        if(goal2[i] != cards1[j]):
                            answer += 'No'
                            return answer
    if(answer != 'No'): # 그래도 없으면
        answer += 'Yes'
        return answer
    
# cards1 = ["i", "drink", "water"]
# cards2 = ["want", "to"]
# goal = ["i", "want", "to", "drink", "water"]

# cards1 = ["def", "bcd"]
# cards2 = ["b", "c", "d"]
# goal = ["bcd"]

cards1 = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"]
cards2 = ["string", "or", "integer"] 
goal = ["string", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"]
print(solution(cards1,cards2,goal))
