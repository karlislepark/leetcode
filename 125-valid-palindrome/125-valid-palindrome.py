from numpy.core.defchararray import isalnum

class Solution:
    def isPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s)-1
        while i < j:
            #test1 = s[i].upper()
            #test2 = s[j].upper()
            while s[i].isalnum() == False:
                i = i + 1
                if i >= len(s):
                    return True
            while s[j].isalnum() == False:
                j = j - 1
            #test3 = s[i].upper()
            #test4 = s[j].upper()
            if s[i].upper() != s[j].upper():
                return False
            elif s[i].upper() == s[j].upper():
                i = i + 1
                j = j - 1
        return True
        