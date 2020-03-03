from math import floor

def binary_search(input_list, item):
    low = 0
    high = len(input_list) - 1
    print(high)
    while low <= high:
        mid = floor((low + high) / 2)
        guess = input_list[mid]
        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return None


my_list = [1, 3, 5, 7, 9]

print(binary_search(my_list, 3))

