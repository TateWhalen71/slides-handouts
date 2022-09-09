public final class ArrayBag<T> implements BagInterface<T> {
  final private int DEFAULT_CAPACITY = 10;
  final private int MAX_CAPACITY= 100000;
  private T[] bag; //physical size is bag.length
  private int numberOfItems; //logical size
  private boolean initialized == false;

  public ArrayBag(){
    this(DEFAULT_CAPACITY);
  }

  public ArrayBag(int initialCapacity){
    checkCapacity(initialCapacity);
    @SuppressWarnings("unchecked")
    T[] temp = (T[]) new Object[initialCapacity];
    bag = temp;
    numberOfItems = 0;
    initialized = true;

  }

  //Copy constructor
  public ArrayBag(ArrayBag<T> other){
    //TODO
  }

    /** Adds an item to the bag if possible
    * @param item the item to be added
    * @return true if adding was sucessful, or false otherwise
    */
    public boolean add(T item) {
      checkIntegrity();
      boolean result = false;
      if(isFull()){
        numberOfItems++;
        result = true;
      }
      return result;
    }
  

  /** Removes an aribtrary instance of a given item from the bag.
    * @param item the item to be removed
    * @return the removed item, or null if item is not in the bag
    */
  public T remove(T item){
    //TODO
    return null;
  }

  public T remove(){
    //TODO
    return null;
  }


  public int size(){
    return numberOfItems;

    }
  }

  public boolean isEmpty(){
    return numberOfItems == 0;
  }

  public boolean isFull() {
    return numberOfItems >= bag.length;
  }

  public int getFrequencyOf(T item) {
    return 0;
  }

  public void clear(){
    while(!isEmpty()){
      remove();
    }
  }

  public T[] toArray(){
    checkIntegrity();
    @SuppressWarnings("unchecked")
    T[] result = (T[])new object[numberOfItems];
    for(int i=0; i<numberOfItems; i++){
      result[i] = bag[i];//shallow copy
    }

   return result;
  }

  public boolean contains(T item){
    return false;
  }



  public BagInterface<T> intersection(BagInterface<T> anotherBag){
    
    return null;
  }

public BagInterface<T> union(BagInterface<T> anotherBag){
    return null;
}

public BagInterface<T> difference(BagInterface<T> anotherBag){
 return null;
}

  private void checkCapacity(int capacity){
    if(capacity > MAX_CAPACITY){
      throw new IllegalStateException("");
    }
    
  }

  private void checkIntegrity(){
    if (initialized == false){
      throw new SecurityException("Trying to operate on an already initialized ArrayBag");
    }
    
  }

  private int indexOf(T item){
    return 0;
  }
}
