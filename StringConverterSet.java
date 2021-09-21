import java.util.Iterator;
import java.util.ArrayList;

public class StringConverterSet extends java.util.AbstractSet {
  private ArrayList items;

  public StringConverterSet() {
    this.items = new ArrayList();
  };

  private class IteratorStringAdapter implements Iterator {
    private int currentPosition = 0;

    public boolean hasNext() {
      return (currentPosition < items.size());
    }

    public String next() {
      return items.get(currentPosition++).toString();
    }
  }

  @Override
  public IteratorStringAdapter iterator() {
    return new IteratorStringAdapter();
  }

  public boolean add(Object item) {
    if(items.contains(item)) return false;

    items.add(item);
    return true;
  };

  public boolean remove(Object item) {
    if (isEmpty()) return false;
    if(!items.contains(item)) return false;

    items.remove(item);
    return true;
  };

  public boolean isEmpty() {
    return size() == 0;
  };

  public void finalize() {
    this.items = new ArrayList<Object>();
  };

  public int size() {
    return items.size();
  }
}

// 4. 
// a. Falso su declaracion es en si una isntanciacion y esta no se puede replicar en otra parte sin redeclarar la clase.
// b. verdadero
// c. Supongo que las interfaces de tipo marker son interfaces vacias con el unico objetivo de darle nombre a clases anonimas, en ese caso falsa ya que cualquier interfaz o superclase cumple con el objectivo.
// d. verdadero