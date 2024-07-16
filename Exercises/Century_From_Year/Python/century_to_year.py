import math


def century(year):
    if year % 100 == 0:
        century = math.floor(year / 100)
    else:
        century = math.floor((year / 100) + 1)
    return century


print(century(356))
