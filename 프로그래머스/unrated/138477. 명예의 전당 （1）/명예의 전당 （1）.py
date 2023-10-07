'''
매일 1명의 가수가 노래, 시청자가 점수 부여
지금까지 점수들 중 상위 k번째 이내이면 명예의 전당으로
명예의 전당에는 k명만 있어야 함
score => 사람들의 점수 
'''
def solution(k, score):
    answer = []
    result = []
    for i in range(len(score)):
        answer.append(score[i]) # i를 일단 넣어
        answer.sort(reverse=True) # 정렬해 거꾸로
        answer = answer[:k] # k등까지 자르기
        result.append(answer[-1])
    return result