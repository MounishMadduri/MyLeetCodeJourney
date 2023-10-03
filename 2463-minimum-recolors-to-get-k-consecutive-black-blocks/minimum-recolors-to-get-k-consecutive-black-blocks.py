class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        
        count_w = blocks[0:k].count('W')
        print(count_w)
        l = 0
        mini =count_w
        for r in range(k,len(blocks)):
            l+=1
            if blocks[l-1] == 'W':
                count_w-=1
            if blocks[r] == 'W':
                count_w+=1
            mini = min(count_w, mini)
        return mini