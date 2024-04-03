import sys
input = sys.stdin.readline

n, m = map(int, input().split())

# 키 => 단어
# 값 => 개수 
word_list = {}

for i in range(n):
    word = input().strip()
    if len(word) < m:
        continue

    if word in word_list:
        word_list[word][0] += 1
    else:
        word_list[word] = [1, len(word), word]

# print("정렬 전 : ", word_list)

word_list = sorted(word_list.items(), key = lambda x:(-x[1][0], -x[1][1], x[1][2]))

# print("정렬 후 : ",word_list)
# print(word_list[0][1])

for i in word_list:
    print(i[0])