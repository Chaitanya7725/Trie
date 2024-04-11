package medium;

// Refer this link: https://leetcode.com/problems/implement-trie-prefix-tree/
// https://leetcode.com/problems/implement-trie-prefix-tree/submissions/1228991881/
class Node {

    boolean isWord;
    char val;
    Node [] children;

    public Node(boolean isWord, char val, Node[] children) {
        this.isWord = isWord;
        this.val = val;
        this.children = children;
    }
}
public class ImplementTrie208 {

    public static void main(String[] args) {

    }

}
