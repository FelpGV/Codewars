def char_concat(word):
    result = ""
    for i in range(len(word)//2):
        result += f"{word[i]}{word[-i-1]}{i+1}"
    return result

word = "abcdef"
result = char_concat(word)
print(result)