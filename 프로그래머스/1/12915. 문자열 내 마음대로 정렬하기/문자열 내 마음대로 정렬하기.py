def solution(strings, n):
    strings.sort()
    array = sorted(strings, key = lambda x:x[n])
    print(array)
    return array

# sorted(strings, key = lambda x:x[n])