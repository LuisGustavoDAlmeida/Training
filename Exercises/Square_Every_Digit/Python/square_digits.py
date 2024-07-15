def square_digits(num):
    square_digits = ""
    for i in str(num):
        n = int(i)
        sqr = n * n
        sqr = str(sqr)
        square_digits += sqr
    return int(square_digits)