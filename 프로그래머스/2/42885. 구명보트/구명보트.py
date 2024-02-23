'''
정렬을 해준다음에 양쪽에서 뺴줘야 하므로 deque를 사용해야 한다.
투포인터!!
확실히 2단계부터는 자료구조, 알고리즘을 공부해야지 뭔가 가능할 것 같다.
'''
from collections import deque
# 투포인터에 관련된 문제다/!!

def solution(people, limit):
    people.sort()
    de_people = deque(people)
    count = 0
    while len(de_people) > 1:
        if de_people[0] + de_people[-1] > limit:
            count += 1
            de_people.pop()
        else:
            count += 1
            de_people.pop()
            de_people.popleft()
    if len(de_people) == 1:
        count += 1
    
    return count        



















# def solution(people, limit):
#     answer = 0
#     people.sort()
#     de_people = deque()
#     for p in people:
#         de_people.append(p)

#     while len(de_people) > 1:
#         if (de_people[0] + de_people[-1] > limit):
#             answer += 1
#             de_people.pop()  # 제일 작은 친구와 제일 큰 친구가 한도를 넘었으니까 마지막 친구만 빼자
#         else:  # 안 넘으면 둘다 빼자
#             answer += 1
#             de_people.pop()
#             de_people.popleft()

#     if len(de_people) == 1:
#         answer += 1
#     return answer