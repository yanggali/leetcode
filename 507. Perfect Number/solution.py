class Solution:
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num <= 0: return False
        s,SQRT = 0,int(num**0.5)
        s += sum(i+num//i for i in range(1,SQRT+1) if not num%i)
        if SQRT**2 == num: s -= SQRT
        return s - num == num