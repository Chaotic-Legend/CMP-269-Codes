# Read the full input, which includes a character followed by a phrase.
user_input = input()

# Split into the character and the phrase.
ch, phrase = user_input[0], user_input[2:]

# Count how many times the character appears in the phrase.
count = phrase.count(ch)

# Decide whether to use the plural form.
if count == 1:
    print(f'{count} {ch}')
else:
    print(f'{count} {ch}\'s')
