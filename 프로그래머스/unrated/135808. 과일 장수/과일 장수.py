'''
사과 상태에 따라 1점부터 k점까지 점수로 분류
k점이 제일 높은 점수 
한 상자에 사과 m개씩
가장 낮은 점수가 p인 경우 한 상자의 가격은 p*m
가능한 많은 사과를 팔았을 때 얻을 수 있는 최대 이익을 계산

정렬해서 맨 마지막부터 빼내기 
과일 장수가 얻을 수 있는 최대 이익을 return

점수 비교도 해줘야함
'''
def solution(k, m, score):
    answer = 0
    
    score.sort()
    score_list = []
    for i in range(len(score)-1,-1,-1):
        score_list.append(score[i])
        if (len(score_list)) == m:
            answer += min(k,min(score_list))*m
            score_list = []
    return answer