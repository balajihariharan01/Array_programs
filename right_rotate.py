def right_rotate(arr, d):
    n = len(arr)
    rotated = arr[-d % n:] + arr[:-d % n]
    return rotated

arr =list(map(int,input("ENTER ARRAY ELEMENTS ").split()))
d = int(input())
rotated_arr = right_rotate(arr, d)
print("Rotated Array:", rotated_arr)
