def find_outlier(integers):
    odd = []
    even = []
    for number in integers:
        if number % 2 == 0:
            odd.append(number)
        else:
            even.append(number)

    if len(odd) > len(even):
        return even[0]
    else:
        return odd[0]
    return odd

integers = [3,3,3,3,3,3,3,3,3,3,3,3,3,3,35,5,5,5,5,5,5,5,5,5,5,7,7,7,7,1000]
print(find_outlier(integers))