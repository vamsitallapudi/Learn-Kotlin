# to check if more than one char is odd
def check_more_than_one_odd(lst):
    odd_found = False
    for i in lst:
        if i % 2 == 1:
            if odd_found:
                return False
            odd_found = True
    return odd_found


# map each character to a number a->0, b->1, z->25
def map_char_to_num(c):
    a = ord('a')
    z = ord('c')
    s = ord(c)
    if a <= s <= z:
        return s - a
    else:
        return -1





# how many times each character appears
def char_frequency_table(str):
    lst = list(str)
    for i in lst:
        map_char_to_num(i)
    
    return lst

# def isPalindromePermutation(s):

x = input('Enter a Number:')
print()

