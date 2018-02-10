class Solution:
    def findLUSlength(self, strs):
        """
        :type strs: List[str]
        :rtype: int
        """
        # judge if s2 is a subsequence of s1
        def issub(s1,s2):
        	return all(c in s1 for c in s2)

        for s in sorted(strs,key=len,reverse=True)
        	# t is the longest subseq only if t is it's own subsequence
        	if sum(issub(t,s) for t in strs) == 1:
        		return len(s)
        return -1