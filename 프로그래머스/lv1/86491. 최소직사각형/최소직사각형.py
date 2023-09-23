'''
지갑의 크기 정하기
모든 크기의 명합을 수납하고 지갑은 최대한 작아야 한다.
가로로 눕히는 경우도 생각할 수 있다.
앞에 큰수, 뒤에 작은 수 넣으면 될 것 같다.
'''
def solution(sizes):
    a_max = 0
    b_max = 0
    for i in range(len(sizes)):
        if(sizes[i][0] > sizes[i][1]):
            big = sizes[i][0]
            small = sizes[i][1]
        else:
            big = sizes[i][1]
            small = sizes[i][0]
        if(big > a_max):
            a_max = big
        if(small > b_max):
            b_max = small
    return a_max * b_max