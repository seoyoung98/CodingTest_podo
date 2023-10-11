def solution(citations):
    citations.sort()
    
    for i in range(len(citations)): # 0,1,3,5,6  # 5,4,3,2,1 # 0,1,2,3,4
        if(citations[i] >= (len(citations)-i)):
            return (len(citations)-i) # [0,5,6,7,8] -> [4] # 0,1,2,3,4
    return 0   