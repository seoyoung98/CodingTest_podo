def solution(numbers):
    numbers.sort()
    len_num = len(numbers)
    return numbers[len_num-1]*numbers[len_num-2]