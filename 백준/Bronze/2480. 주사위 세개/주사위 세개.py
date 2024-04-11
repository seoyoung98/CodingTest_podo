dice = list(map(int, input().split()))

dice_dict = {}

for i in dice:
    if i in dice_dict:
        dice_dict[i] += 1
    else:
        dice_dict[i] = 1

dice_dict = sorted(dice_dict.items(), key = lambda item:item[1], reverse=True)

if len(dice_dict) == 1:
    money = 10000 + dice_dict[0][0] * 1000
elif len(dice_dict) == 2:
    money = 1000 + dice_dict[0][0] * 100
elif len(dice_dict) == 3:
    money = max(dice) * 100

print(money)