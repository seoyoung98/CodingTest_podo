import math
def solution(n):
    print(math.sqrt(144))
    # math.sqrt(n) => 결과는 소수점이 붙어서 나온다. 
    # 따라서 정수로 만들어주고, 다시 실수로 .0을 붙여서 비교를 해야 한다.
    if float(int(math.sqrt(n))) == math.sqrt(n):
        return 1
    else:
        return 2