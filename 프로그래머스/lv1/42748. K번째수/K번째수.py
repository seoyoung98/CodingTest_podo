def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        first_num = commands[i][0] - 1
        second_num = commands[i][1]
        list = array[first_num : second_num]
        list.sort()
        answer.append(list[commands[i][2]-1])
    return answer