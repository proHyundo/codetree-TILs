import sys

N = int(input())
arr = list(map(int, input().split()))
dp = [-sys.maxsize] * (N)
dp[0] = arr[0]

for i in range(1, N):
    dp[i] = max(arr[i], dp[i-1] + arr[i])

print(max(dp))