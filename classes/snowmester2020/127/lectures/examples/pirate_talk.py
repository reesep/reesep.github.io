
def translator(sentence,pirate):

    words = sentence.split(" ")

    new_sentence = []
    for each_word in words:

        if each_word in pirate:
            pirate_word = pirate[each_word]
            new_sentence.append(pirate_word)
        else:
            new_sentence.append(each_word)

    new_sentence = " ".join(new_sentence)
    return new_sentence

            


    

pirate = {}
pirate['sir'] = "matey"
pirate['hotel'] = "fleabag inn"
pirate['student'] = "swabbie"
pirate['boy'] = "matey"
pirate['madam'] = "proud beauty"
pirate['professor'] = "foul blaggert"
pirate['restaurant'] = "gallery"
pirate['your'] = "yer"
pirate['excuse'] = "arr"
pirate['students'] = "swabbies"
pirate['are'] = "be"
pirate['the'] = "th'"
pirate['my'] = "me"
pirate['hello'] = "avast"
pirate['is'] = "be"


sentence = input("Enter a sentence")
pirate_sentence = translator(sentence, pirate)

print(pirate_sentence)
