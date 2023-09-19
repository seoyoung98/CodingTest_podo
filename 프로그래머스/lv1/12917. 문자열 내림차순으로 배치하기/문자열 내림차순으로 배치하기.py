def solution(s):
    # 대문자는 소문자 보다 작은 것으로 간주
    return "".join(sorted(list(s), reverse=True))