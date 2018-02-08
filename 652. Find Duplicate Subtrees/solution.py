class Solution:
    def findDuplicateSubtrees(self, root):
        """
        :type root: TreeNode
        :rtype: List[TreeNode]
        """
        count = collections.Counter()
        nodes = []
        # return tree serial of node
        def collect(node):
        	if not node: return "#"
        	# store root node,left nodes,right nodes serial by depth traverse
        	serial = "{},{},{}".format(node.val,collect(node.left),collect(node.right))
        	count[serial] += 1
        	if count[serial] >= 2:
        		nodes.append(node)
        	return serial
        	
        collect(root)
        return nodes