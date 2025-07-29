def left_rotate(arr, d):
    n = len(arr)
    rotated = arr[d % n:] + arr[:d % n]
    return rotated

arr = [1, 2, 3, 4, 5]
d = 2
rotated_arr = left_rotate(arr, d)
print("Rotated Array:", rotated_arr)
