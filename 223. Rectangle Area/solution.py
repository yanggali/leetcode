class Solution:
    def computeArea(self, A, B, C, D, E, F, G, H):
        """
        :type A: int
        :type B: int
        :type C: int
        :type D: int
        :type E: int
        :type F: int
        :type G: int
        :type H: int
        :rtype: int
        """
        if C>G:
            l = max(C-max(A,E) - (C-G),0)
        else:
            l = max(G-max(A,E) - (G-C),0)
        if H>D:
            w = max(H-max(B,F)-(H-D),0)
        else:
            w = max(D-max(B,F)-(D-H),0)
        return (C-A)*(D-B)+(G-E)*(H-F)-l*w
            