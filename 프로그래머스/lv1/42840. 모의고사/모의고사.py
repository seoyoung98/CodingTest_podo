def lcm(a, b):
    for i in range(max(a, b), (a * b) + 1):
        if i % a == 0 and i % b == 0:
            return i
        
def solution(answers):
    answer = []
    test = len(answers) # 정답의 개수 
    # 각 학생들의 반복 배열
    student1 = [1, 2, 3, 4, 5]
    student2 = [2, 1, 2, 3, 2, 4, 2, 5]
    student3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    students = [0, 0, 0]

    get_lcm = lcm(40, test)  # 최소 공배수를 구해줌 => 40

    student1_loop = student1 * 2000
    student1_loop = student1_loop[:test]
    student2_loop = student2 * 1250
    student2_loop = student2_loop[:test]
    student3_loop = student3 * 1000
    student3_loop = student3_loop[:test]

    for i in range(test):
        if (answers[i] == student1_loop[i]):
            students[0] += 1
        if (answers[i] == student2_loop[i]):
            students[1] += 1
        if (answers[i] == student3_loop[i]):
            students[2] += 1

    for i in range(3):
        if max(students) == students[i]:
            answer.append(i+1)
    return answer