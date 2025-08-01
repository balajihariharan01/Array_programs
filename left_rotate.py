def left_rotate(arr, d):
    n = len(arr)
    rotated = arr[d % n:] + arr[:d % n]
    return rotated

arr = list(map(int,input().split()))
d = int(input())
rotated_arr = left_rotate(arr, d)
print("Rotated Array:", rotated_arr)
