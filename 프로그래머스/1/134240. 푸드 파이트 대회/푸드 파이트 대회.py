'''
1대1 대결, 대결마다 음식의 종류와 양이 바뀐다.
음식을 일렬로 배치한 후 한 명은 젤 왼쪽부터, 한 명은 젤 오른쪽 부터 먹는다.
중앙 물, 제일 먼저 먹는 선수가 승리
양 쪽 양과 종류가 같아야 하고 첫 시작은 칼로리가 낮은 음식부터
대회를 위한 음식의 배치를 나타내는 문자열을 return
'''
def solution(food):
    origin_list = []
    for i in range(1, len(food)):
        for j in range(food[i]//2):
            origin_list.append(str(i))
    print(origin_list)
    
    reverse_list = origin_list[::-1]
    origin_list.append('0')
    total_list = origin_list + reverse_list
    return ''.join(total_list)


# def solution(food):
#     left_list = []
#     total_list = []
#     for i in range(1,len(food)):
#         for j in range(food[i]//2):
#             left_list.append(str(i))
    
#     right_list = left_list[::-1]
#     total_list = left_list
#     total_list.append('0')
#     total_list = total_list + right_list
#     return ''.join(total_list)