# Build a function that returns an array of integers from n to 1 where n>0.

# Example : n=5 --> [5,4,3,2,1]

def reverse_seq(n):
    n.reverse()
    return n

n = [1, 2, 3, 4, 5]
lista_reversa = reverse_seq(n)

print(lista_reversa)