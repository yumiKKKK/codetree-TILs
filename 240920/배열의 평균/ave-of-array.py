arr = [
    list(map(int, input().split()))
    for _ in range(2)
]

#row
for i in range(len(arr)):
    ans = round(sum(arr[i])/4,1)
    print(ans, end =' ')

#col
print()
for i in range(len(arr[0])):
    ans = round(arr[0][i]+ arr[1][i]/2,1)
    print(ans, end =' ')

#total
print()
t = 0
for i in range(len(arr)):
    t+=(sum(arr[i]))
print(round(t/8,1))