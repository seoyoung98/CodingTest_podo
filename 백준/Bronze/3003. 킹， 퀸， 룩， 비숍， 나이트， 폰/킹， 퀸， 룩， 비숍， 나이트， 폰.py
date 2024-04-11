correct = [1, 1, 2, 2, 2, 8]

wrong = list(map(int, input().split()))

answer = []

for i in range(len(correct)):
    answer.append(correct[i]-wrong[i])

print(' '.join(map(str, answer)))