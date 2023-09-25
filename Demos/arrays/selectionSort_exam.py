# Selection sort in Python


def selectionSort(array):
    size = len(array)
    for step in range(size-1):
        max_index = step

        for i in range(step + 1, size):
 
            if array[i] > array[max_index]:
                max_index = i
         
        # put max at the correct position (swap)
        (array[step], array[max_index]) = (array[max_index], array[step])
        print(str(step+1) + " " + str(array))


data = [12, 52, 16, 42, 88, 86]
print('Original Array')
print(data)
print()
# print column headers (indices)
print("    " , end="")
for c in range(len(data)):
    print(str(c), end="   ")
print()

selectionSort(data)
print('\nSorted Array in Descending Order:')
print(data)
