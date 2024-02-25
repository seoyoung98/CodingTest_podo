def solution(k, tangerine):
    count = 0
    box = [0] * (max(tangerine) + 1)
    for i in range(len(tangerine)):
        box[tangerine[i]] += 1
    box.sort(reverse=True)
    i = 0
    while (k > 0):
        k -= box[i]
        i += 1
        count += 1
    return count
            
    

# def solution(k, tangerine):
#     sum = 0
#     answer = 0
#     tangerine_dic = {}
#     for i in range(len(tangerine)):
#         if (tangerine[i] not in tangerine_dic):
#             tangerine_dic[tangerine[i]] = 1
#         else:
#             tangerine_dic[tangerine[i]] += 1
#     tangerine_dic = dict(
#         sorted(tangerine_dic.items(), key=lambda x: x[1], reverse=True))

#     # 여기까지 정렬 완료
#     for key, value in tangerine_dic.items():
#         if (sum >= k):
#             break
#         else:
#             sum += value
#             answer += 1

#     return answer