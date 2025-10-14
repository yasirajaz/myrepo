def binary_search(a, start, end, data):
    if start <= end:
        mid = (start + end) // 2
        if a[mid] == data:
            return mid
        elif a[mid] < data:
            return binary_search(a, mid + 1, end, data)
        else:
            return binary_search(a, start, mid - 1, data)
    else:
        return -1


def bs(b, left, right, data):
    while left <= right:
        mid = (left + right) // 2
        if data == b[mid]:
            return mid
        elif data < b[mid]:
            right = mid - 1
        else:
            left = mid + 1
    return -1


def main():
    arr = [1, 2, 3, 4, 5, 6, 7, 8]
    len_arr = len(arr)
    value = int(input("Enter the value to be searched: "))
    
    index = binary_search(arr, 0, len_arr - 1, value)
    index2 = bs(arr, 0, len_arr - 1, value)

    if index == -1:
        print("Value is not in array")
    else:
        print(f"{value} is found at {index}")

    if index2 == -1:
        print("Value is not in array")
    else:
        print(f"Value is found at {index2}")


if __name__ == "__main__":
    main()
