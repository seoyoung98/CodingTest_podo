n = int(input())

answer = 0

for _ in range(n):
    word = input()
    arr = []

    if len(word) == 1:
        answer += 1
    else:
        arr.append(word[0])
        for i in range(1, len(word)):
            if word[i] not in arr:
                arr.append(word[i])
            else:
                if word[i] != word[i-1]:
                    break
            
            if i == len(word) - 1:
                answer += 1

print(answer)