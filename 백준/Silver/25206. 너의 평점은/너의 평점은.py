alpha = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F']
num = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0]

score_sum = 0
hap = 0

for _ in range(20):
    subject, major, score = input().split()
    if score == 'P':
        continue
    else:
        hap += float(major)
        score_sum += float(major) * num[alpha.index(score)]

print(round(score_sum / hap, 6))