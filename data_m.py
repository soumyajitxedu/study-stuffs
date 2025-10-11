#Using the NumPy library, create a 2x3 array (2 rows, 3 columns) containing the numbers 1, 2, 3, 4, 5, and 6. Then, add 10 to every single element in the array and print the resulting array.
import numpy as np 
arr = np.array([
    [1, 2, 3],
    [4, 5, 6]
])
print("orginal value")
print(arr)
add = arr + 10
print(add)