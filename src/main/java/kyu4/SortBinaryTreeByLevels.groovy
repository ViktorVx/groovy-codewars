package kyu4

class SortBinaryTreeByLevels {

    static def treeByLevels(n) {
        throughTheTree(new SortNode(), n, Direction.LEFT, [:]).sort().values()
    }

    static def throughTheTree(SortNode sortNode, Node node, Direction direction, res) {
        sortNode.weight = sortNode.parent == null ? "1" : "$sortNode.parent.weight$direction.value"
        res.put(new BigInteger(sortNode.weight), node.value)
        SortNode sn = new SortNode()
        sn.parent = sortNode
        if (node.left != null) {
            sortNode.left = sn
            throughTheTree(sortNode.left, node.left, Direction.LEFT, res)
        }
        if (node.right != null) {
            sortNode.right = sn
            throughTheTree(sortNode.right, node.right, Direction.RIGHT, res)
        }
        res
    }

    class Node {
        Integer value
        Node left
        Node right

        Node(left, right, value) {
            this.value = value
            this.left = left
            this.right = right
        }
    }

    static enum Direction {
        LEFT("1"), RIGHT("2")
        String value

        Direction(String value) {
            this.value = value
        }
    }

    static class SortNode {
        String weight
        SortNode parent
        SortNode left
        SortNode right
    }
}