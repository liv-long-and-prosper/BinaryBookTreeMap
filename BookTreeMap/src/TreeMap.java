package BookTreeMap.src;

//TODO: Generate proper javadoc
public class TreeMap<K,V extends Comparable<K>> implements TreeMapInterface<K,V>{
    private TreeMapNode<K,V> overallRoot; // root of overall tree
    private int size;

    // post: constructs an empty search tree
    public TreeMap() {
        overallRoot = null;
    }

    /**
     * Retrieves the number of key/value pair elements managed by the map
     *
     * @return number of elements
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Clears the existing tree, removing any and all existing key/value pairs.
     */
    @Override
    public void clear() {

    }

    /**
     * Retrieves the corresponding value for the specified key.
     *
     * @param key key of interest.
     * @return value corresponding to the specified key, or null if the key is not found.
     */
    @Override
    public V get(K key) {
        //TODO: Take a key parameter; return the corresponding value (or null, if not found)
        //TODO: Check for null, throw IllegalArgumentException with a clear msg if key is null
        return null;
    }

    /**
     * Adds a key/value pair to the tree map.
     *
     * @param key   the key. If not already in the tree, the key/value pair is added.  If already in the
     *              tree, the existing value is replaced with the one specified here.
     * @param value the value in the key/value pair.
     */
    @Override
    public void put(K key, V value) {
        //TODO: Add code from add()method here
        //TODO: Modify code so that if key already exists in the tree, the existing value is updated
    }

    /**
     * Checks the tree to see if it contains the specified key.
     *
     * @param key the key to search for.
     * @return true, if the key is in the tree map; false, if not.
     */
    @Override
    public boolean containsKey(K key) {
        return false;
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
        return null;
    }


    //TODO: Write some shit that will recursively traverse the tree so you can add shit to the key array or whatever
    private void traverseInOrder(TreeMapNode<K,V> node){
    }
    

        // post: value added to tree to preserve binary search tree
        //TODO: modify add method so it increments the size variable when appropriate
        //TODO: modify add method to disallow null entries. Handle with an IllegalArgumentException with a clear message
//        public void add(K value) {
//            overallRoot = add(overallRoot, value);
//        }

        // post: value added to tree to preserve binary search tree
//        private TreeMapNode<K,V> add(TreeMapNode<K,V> root, K,V value) {
//            if (root == null) {
//                root = new TreeMapNode<K,V>(value);
//            } else if (root.data.compareTo(value) >= 0) {
//                root.left = add(root.left, value);
//            } else {
//                root.right = add(root.right, value);
//            }
//            return root;
//        }

        // post: returns true if tree contains value, returns false otherwise
//        public boolean contains(K,V value) {
//            return contains(overallRoot, value);
//        }

        // post: returns true if given tree contains value, returns false otherwise
//        private boolean contains(TreeMapNode<K,V> root, K,V value) {
//            if (root == null) {
//                return false;
//            } else {
//                int compare = value.compareTo(root.data);
//                if (compare == 0) {
//                    return true;
//                } else if (compare < 0) {
//                    return contains(root.left, value);
//                } else {   // compare > 0
//                    return contains(root.right, value);
//                }
//            }
//        }


    //TODO: Remove before submitting - keep for testing throughout project
        // post: prints the data of the tree, one per line
//        public void print() {
//            printInorder(overallRoot);
//        }

        // post: prints the data of the tree using an inorder traversal
//        private void printInorder(TreeMapNode<K,V> root) {
//            if (root != null) {
//                printInorder(root.left);
//                System.out.println(root.data);
//                printInorder(root.right);
//            }
//        }

        private static class TreeMapNode<K,V> {
            public K key;
            public V value;                   // data stored in this node
            public TreeMapNode<K,V> left;   // left subtree
            public TreeMapNode<K,V> right;  //  right subtree

            // post: constructs a leaf node with given data
            public TreeMapNode(K key,V value) {
                this(key, value, null, null);
            }

            // post: constructs a node with the given data and links
            public TreeMapNode(K key,V value, TreeMapNode<K,V> left,
                                  TreeMapNode<K,V> right) {
                this.key = key;
                this.value = value;
                this.left = left;
                this.right = right;
            }
        }
    }
