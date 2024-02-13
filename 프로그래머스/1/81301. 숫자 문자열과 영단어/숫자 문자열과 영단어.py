'''
숫자의 
'''

def solution(s):
    english_num = {"zero" : "0",
                  "one" : "1",
                  "two" : "2",
                  "three" : "3",
                  "four" : "4",
                  "five" : "5",
                  "six" : "6",
                  "seven" : "7",
                  "eight" : "8",
                  "nine" : "9"}
    print(english_num.items())
    
    for key, value in english_num.items():
        if key in s: # zero, ... , nine이 s 안에 있으면 
            s = s.replace(key, value) # one을 1로 바꿔준다.
    return int(s)