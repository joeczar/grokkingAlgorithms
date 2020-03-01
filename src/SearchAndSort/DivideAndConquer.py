def sum(arr):
    total = 0
    for x in arr:
        total += x
    return total

def sumRecursive(arr, acc = 0, count = 0):
    if count >= len(arr):
        return acc
    else: 
        return sumRecursive(arr, arr[count] + acc, count +1)

list = [1,2,3,4,5]
print(sum(list))
print(sumRecursive(list))

def findLength(arr, acc = 0):
    if len(arr) == 0:
        return acc
    else:
        head, *tail = arr
        return findLength(tail, acc + 1)

def max(arr, biggest = 0):
    if len(arr) == 0:
        return biggest
    head, *tail = arr
    if head > biggest:
        return max(tail, head)
    else:
        return max(tail, biggest)

print(max(list))
print(findLength(list))

def quicksort(array):
    if len(array) < 2:
        return array
    else:
        pivot = array[0]
        less = [i for i in array[1:] if i <= pivot]
        greater = [i for i in array[1:] if i > pivot]
        return quicksort(less) + [pivot] + quicksort(greater)

print(quicksort([10, 5, 2, 3, 6, 8]))