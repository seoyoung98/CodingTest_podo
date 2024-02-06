def solution(array):
    array.sort()
    len_arr = len(array)
    if len_arr % 2 == 0:
        return array[len_arr//2-1]
    else:
        return array[len_arr//2]