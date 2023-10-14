def lcm(a, b):
    for i in range(max(a, b), (a*b)+1):
        if (i % a == 0) and (i % b == 0):
            return i


def solution(arr):
    first = 1
    for i in range(len(arr)):
        compare_num = lcm(first, arr[i])
        first = compare_num

    return compare_num