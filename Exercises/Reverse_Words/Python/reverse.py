def reverse_words(text): 
    words = text.split(" ")
    reversed_phrases = []
    
    for word in words:
        i = (len(word)) - 1
        reversed_word = ""
        for char in word:
            while i < len(word):
                if (i < 0):
                    break
                else:
                    char = (word[i])
                    i -= 1
                    reversed_word += char
            reversed_phrases.append(reversed_word)
            break
    if "  " in text:
        return "  ".join(reversed_phrases)
    else:
        return " ".join(reversed_phrases)
print(reverse_words(text = "The quick"))