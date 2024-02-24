class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        length = len(word1) if len(word1)<len(word2) else len(word2)
        word = ''
        for i in range(length):
            word += word1[i] + word2[i]

        if len(word1)<len(word2):
            word+=word2[length::]
        elif len(word1)>len(word2):
            word+=word1[length::]
        print(word)
        return word