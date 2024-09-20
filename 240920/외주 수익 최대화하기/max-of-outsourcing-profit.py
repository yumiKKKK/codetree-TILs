n = int(input()) 
info = [
    list(map(int, input().split()))
    for _ in range(n)
]
time_limit = [
    i[0] for i in info
]
benefit = [
    i[1] for i in info
]
dp = benefit[:]

for i in range(n):
    if time_limit[i] + i > n:
        dp[i] = 0 
    for j in range(i):
        if time_limit[j] <= i - j:
            if time_limit[i] + i <= n:
                dp[i] = max(dp[i], dp[j] + benefit[i])
print(max(dp))