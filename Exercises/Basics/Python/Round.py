# Nathan loves cycling.

# Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

# You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

import math

def litres(time):
    litres = math.floor(time * 0.5) # Floor arredonda pra baixo e Ceil pra cima
    print(litres)
    return litres
pass

litres (6.7)