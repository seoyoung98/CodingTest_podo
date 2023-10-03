'''
2016년 a월 b일은 무슨 요일?
29일 - 2
30일 - 4, 6, 9, 11
31일 - 1, 3, 5, 7, 8, 10, 12

'''
def solution(a, b):
    answer = ''
    month_dic = {1:31,2:29,3:31,4:30,5:31,6:30,7:31,8:31,9:30,10:31,11:30,12:31}
    day_sum = 0
    for i in range(1,a):
        day_sum += month_dic.get(i)
    day_sum += b
    
    day = day_sum % 7
    
    if(day == 1):
        answer += "FRI"
    elif(day == 2):
        answer += "SAT"
    elif(day == 3):
        answer += "SUN"
    elif(day == 4):
        answer += "MON"
    elif(day == 5):
        answer += "TUE"
    elif(day == 6):
        answer += "WED"
    elif(day == 0):
        answer += "THU"
    
    
    return answer