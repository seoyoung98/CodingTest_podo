word = input()

cro = ['c=','c-','dz=','d-','lj','nj','s=','z=']
alpha = []

for i in cro:
    word = word.replace(i, "*")

print(len(word))

# 시간초과 ㅜㅠㅠ
# i = 0
# while i < len(word):    
#     make = ''
#     three_word = 'a'
#     if i <= len(word) - 3:
#         three_word = word[i]+word[i+1]+word[i+2]
#     two_word = 'a'
#     if i <= len(word) - 2:
#         two_word = word[i]+word[i+1]
#     if three_word in cro:
#         i += 3
#         if three_word not in alpha:
#             alpha.append(three_word)
#         continue
#     elif two_word in cro:
#         i += 2
#         if two_word not in alpha:
#             alpha.append(two_word)
#         continue
#     elif word[i] not in alpha:
#         alpha.append(word[i])
#         i += 1
    
    
# print(alpha)
# print(len(alpha))
