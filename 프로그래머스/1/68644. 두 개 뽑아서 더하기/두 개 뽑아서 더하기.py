from itertools import combinations
def solution(numbers):
    list_numbers = list(combinations(numbers, 2))
    answer = []
    for i in range(len(list_numbers)):
        answer.append(list_numbers[i][0] + list_numbers[i][1])
    answer = list(set(answer))
    return sorted(answer)
    

# '''
# numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 
# '''
# def solution(numbers):
#     answer = []
#     for i in range(len(numbers)):
#         for j in range(len(numbers)):
#             if(i != j):
#                 if((numbers[i] + numbers[j]) not in answer):
#                     answer.append(numbers[i] + numbers[j])
#     answer.sort()
#     return answer