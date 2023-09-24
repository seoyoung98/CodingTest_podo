'''
각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화

'''
def solution(s, n):
    answer = ""
    
    for i in range(len(s)):
        if s[i] == " ":
            answer += " "
        elif s[i].islower():
            answer += chr((ord(s[i])-ord('a')+n)%26 + ord('a'))
        elif s[i].isupper():
            answer += chr((ord(s[i])-ord('A')+n)%26 + ord('A'))
    return answer