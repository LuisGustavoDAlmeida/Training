def is_prime(num):
    if num <= 0 or num == 1 or num == -1:
        return False
    if num == 2:
        return True
    if num % 2 == 0:
        return False

    i = 3

    for i in range(2, num):
        if num % i == 0:
            return False
        i += 2
    return True

print(is_prime(-5))
