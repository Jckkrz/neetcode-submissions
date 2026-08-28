class MyHashSet {

    private ArrayList<Integer> ints;

    public MyHashSet() {
        ints = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!contains(key)) {
            ints.add(key);
        }
    }
    
    public void remove(int key) {
        ints.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return ints.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */