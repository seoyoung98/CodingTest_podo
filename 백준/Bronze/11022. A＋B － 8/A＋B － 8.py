test = int(input())

for i in range(test):
    a, b = map(int, input().split())
    print("Case #%d: %d + %d = %d"%(i+1,a,b,a+b))