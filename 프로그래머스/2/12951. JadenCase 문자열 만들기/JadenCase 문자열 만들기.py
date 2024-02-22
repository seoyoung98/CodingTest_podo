# def solution(s):
#     result = []
#     s_list = s.split(" ")
    
#     idx = 0
#     for i in range(len(s)):
#         if(s[i] == " "):
#             if(s[idx].isalpha()):
#                 result.append(s[idx:i].capitalize())
#             else:
#                 result.append(s[idx:i])
#             idx = i+1
#             result.append(" ")
    
#     if(s_list[-1][0].isalpha()):
#         result.append(s_list[-1].capitalize())
#     else:
#         result.append(s_list[l-1])
        
#     return ''.join(result)

# def solution(s):
#     word=s.split(' ') # 공백을 기준으로 나눠주면 공백 순서에 ''가 들어간 배열이 생성된다.
#     for i in range(len(word)):
#         if word[i] and word[i][0].isalpha(): # 공백이 아니고 알파벳으로 시작하면 
#             word[i]=word[i].capitalize()# 
#         else:
#             word[i]=word[i].lower()
#     return ' '.join(word)


def solution(s):
    words = s.split(' ')
    print(words)
    for i in range(len(words)):
        if words[i] and words[i][0].isalpha():
            words[i] = words[i].capitalize()
        else:
            words[i] = words[i].lower()
    return ' '.join(words)
    
    