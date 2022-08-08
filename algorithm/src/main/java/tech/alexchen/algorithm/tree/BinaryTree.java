package tech.alexchen.algorithm.tree;

/**
 * 二叉树
 *
 * @author alexchen
 * @date 2022/6/30
 */
public class BinaryTree<T> {

    /**
     * 根结点
     */
    private TreeNode root = null;

    public BinaryTree() {
        root = new TreeNode();
    }

    public BinaryTree(T data) {
        root = new TreeNode(1, data);
    }

    public void createBinaryTree(TreeNode<T> root) {

    }

    /**
     * 判断跟节点是否为空
     *
     * @return 返回根节点是否为空
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * 返回树的结点个数
     *
     * @return 树的结点个数
     */
    public int size() {
        return size(root);
    }

    /**
     * 返回树的结点个数
     *
     * @param root 根结点
     * @return 树的结点个数
     */
    private int size(TreeNode<T> root) {
        return root == null ? 0 : 1 + size(root.leftChild) + size(root.rightChild);
    }

    /**
     * 返回树的深度
     *
     * @return 树的深度
     */
    public int depth() {
        return depth(root);
    }

    /**
     * 返回指定树的深度
     *
     * @param root 指定根结点
     * @return 树的深度
     */
    private int depth(TreeNode<T> root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(depth(root.leftChild), depth(root.rightChild)) + 1;
        }
    }

    private class TreeNode<T> {
        /**
         * 序号
         */
        private int key = 0;
        /**
         * 值
         */
        private T data;
        /**
         * 是否已遍历
         */
        private final boolean isVisited = false;
        /**
         * 左儿子节点
         */
        private TreeNode leftChild;
        /**
         * 右儿子节点
         */
        private TreeNode rightChild;

        /**
         * 默认构造方法
         */
        public TreeNode() {
        }

        /**
         * @param key  层序编码
         * @param data 数据域
         */
        public TreeNode(int key, T data) {
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
}
