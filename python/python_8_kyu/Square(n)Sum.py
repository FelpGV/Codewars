def square_sum(numbers):
    sum = 0
    for n in numbers:
        sum += n*n
    return sum

def square_sum2(numbers):
    return sum(map(lambda n: n*n, numbers))

def square_sum3(numbers):
    return sum(n*n for n in numbers)

result = square_sum3([1, 2, 2])
print(result)