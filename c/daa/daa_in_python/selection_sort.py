def selection_sort(a):
	n = len(a)
	for i in range(n - 1):
		index = i
		for j in range(i + 1, n):
			if a[j] < a[index]:
				index = j
		a[i], a[index] = a[index], a[i]

def print_list(a):
	for num in a:
		print(num, end=" ")
	print()

def main():
	list = [15, 9, 85, 3, 4, 1, 2, 10]
	print("Unsorted list:", end=" ")
	print_list(list)
	selection_sort(list)
	print("Sorted list:", end=" ")
	print_list(list)
if __name__ == "__main__":
	main()
