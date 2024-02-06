def solution(my_string, letter):
    answer = [x for x in list(my_string) if x not in list(letter)]
    return ''.join(answer)