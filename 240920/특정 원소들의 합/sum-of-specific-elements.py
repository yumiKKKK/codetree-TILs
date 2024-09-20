arr  = [
    list(map(int, input().split()))
    for _ in range(4)
]

ans = 0
for i in range(1, 5):
    for j in range(1, 5):
        ans += arr[i-1][j-1]
        if i == j:
            break
        
print(ans)