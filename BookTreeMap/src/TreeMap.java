package BookTreeMap.src;
import java.util.Arrays;

/**
 * The type Tree map.
 *
 * @param <K> the type parameter to be used as a key
 * @param <V> the type parameter to be used as a value
 */
public class TreeMap<K extends Comparable<K>,V> implements TreeMapInterface<K,V> {
    private TreeMapNode<K,V> overallRoot; // root of overall tree
    private int size; // size of the tree

    /**
     * Instantiates a new Tree map.
     */
    public TreeMap() {
       clear();
    }

    /**
     * Size() retrieves the number of key/value pair elements managed by the tree
     *
     * @return       the size of the tree
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Clear() clears the tree map
     * */
    public void clear(){
        overallRoot = null;
        size = 0;
    }

    /**
     * Put() adds a node to the tree with given key/value pairing
     *
     * @param key       the node's key
     * @param value     the node's value
     * */
    public void put(K key, V value) {
        overallRoot = put(overallRoot, key, value);
        size++;
    }

    private TreeMapNode<K,V> put(TreeMapNode<K,V> firstNode, K key, V value) {
        if(key == null){
            throw new IllegalArgumentException("key cannot be null");
        }
        if(value == null){
            throw new IllegalArgumentException("value cannot be null");
        }
        if (firstNode == null) {
            TreeMapNode<K,V> newNode = new TreeMapNode<K,V>(key, value);
            firstNode = newNode;
        } else {
            if (key.compareTo(firstNode.key) == 0) {
               firstNode.value = value;
            } else if (key.compareTo(firstNode.key) <= 0) {
               firstNode.left = put(firstNode.left, key, value);
            } else {
                firstNode.right = put(firstNode.right, key, value);
            }
        }
        return firstNode;
    }

    /**
     * ContainsKey() returns true if the map contains a node with the given key and false if not
     *
     * @param key   the key to search for
     * @return      boolean
     * */
    public boolean containsKey(K key) {
        return contains(overallRoot, key);
    }

    private boolean contains(TreeMapNode<K,V> firstNode, K key) {
        if (firstNode == null) {
            return false;
        } else {
            int compare = key.compareTo(firstNode.key);
            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                return contains(firstNode.left, key);
            } else {   // compare > 0
                return contains(firstNode.right, key);
            }
        }
    }

    /**
     * Get() returns the value of the node that has the given key
     *
     * @param key       the key to search for
     * @return          the value the node contains
     * */
    public V get(K key) {
        if(key == null){
            throw new IllegalArgumentException("key cannot be null");
        }
        return get(key, overallRoot);
    }

    private V get(K key, TreeMapNode<K,V> firstNode){
        if(firstNode == null){
            return null;
        }else{
            if(key.compareTo(firstNode.key) == 0){
                return firstNode.value;
            } else if (key.compareTo(firstNode.key) <= 0) {
                return get(key, firstNode.left);
            }else{
                return get(key, firstNode.right);
            }
        }
    }

    /**
     * Retrieves an array of key data from the map, in order,
     *
     * @param array to fill in.  If smaller than the map's size, a new array will be created.  If larger than the
     *              map's size, data will be filled in from index 0, with a null reference just after the copied-in data.
     * @return a reference to the filled-in array; may be a different array than the one passed in.
     */
    @Override
    public K[] toKeyArray(K[] array) {
        K[] keyArr = array;
        if(keyArr.length <= size){
            keyArr = Arrays.copyOf(keyArr, Math.max(2*keyArr.length+1, 2*size+1));
        }
        traverseAndAdd(overallRoot, keyArr, 0);
        return keyArr;
    }

    private void traverseAndAdd(TreeMapNode<K,V> firstNode, K[] array, int idx){
        if(firstNode != null){
            array[idx] = firstNode.key;
            traverseAndAdd(firstNode.left, array, 2*idx+1);
            traverseAndAdd(firstNode.right, array, 2*idx+2);
        }
    }

//     post: prints the data of the tree, one per line
//    public void print() {
//        printInorder(overallRoot);
//    }

//     post: prints the data of the tree using an inorder traversal
//    private void printInorder(TreeMapNode<K,V> root) {
//        if (root != null) {
//            printInorder(root.left);
//            System.out.println(root.key);
////            System.out.println(root.value);
//            printInorder(root.right);
//        }
//    }

    private static class TreeMapNode<K,V> {
        /**
         * The key the node contains.
         */
        public K key;
        /**
         * The value the node contains.
         */
        public V value;
        /**
         * The left subtree.
         */
        public TreeMapNode<K,V> left;
        /**
         * The right subtree.
         */
        public TreeMapNode<K,V> right;

        /**
         * Instantiates a new Tree map node.
         *
         * @param key   the key to be contained
         * @param value the value to be contained
         */
        public TreeMapNode(K key,V value) {
           this.key = key;
           this.value = value;
           left = right = null;
        }
    }
}
