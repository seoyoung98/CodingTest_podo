def solution(s1, s2):
    return sum([1 for x in s1 if x in s2])
    # return len(s1) - sum([1 for x in s1 if x not in s2])
