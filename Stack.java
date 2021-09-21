import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
  private ArrayList<String> items;

  // private class StackIterator implements Iterator<String> {
  //   private int currentPosition = 0;

  //   public boolean hasNext() {
  //     return (currentPosition < items.size());
  //   }

  //   public String next() {
  //     return items.get(currentPosition++);
  //   }
  // }  

  // public StackIterator iterator() {
  //   return new StackIterator();
  // }

  //5.
  // a tiene sentido cuando necesitamos declarar una clase solo para un metodo
  // y no planeamos reusarlo, de esta manera nos asegurarmos de mantener todo consiso e impedir el reuso.

  // b. hay que usar una sintaxis especial con llaves {}
  public Iterator<String> iterator() {
    return new Iterator<String>() {
      private int currentPosition = 0;

      public boolean hasNext() {
        return (currentPosition < items.size());
      }

      public String next() {
        return items.get(currentPosition++);
      }
    };
  }

  public Stack() {
    this.items = new ArrayList<String>();
  };

  public void push(String item) {
    this.items.add(item);
  };

  public String pop() {
    if (isEmpty())
      return null;
    int lastIndex = size() - 1;

    String lastItem = items.get(lastIndex);
    items.remove(lastIndex);

    return lastItem;
  };

  public boolean isEmpty() {
    return size() == 0;
  };

  public void finalize() {
    this.items = new ArrayList<String>();
  };

  public int size() {
    return items.size();
  }

  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push("Perro");
    stack.push("Gato");
    stack.push("Mono");
    stack.push("Buffalo");

    int size = stack.size();
    for (int i = 0; i < size; i++) {
      System.out.println(stack.pop());
    }

    // c. con el iterator se puede recorrer infinitas veces el arreglo
    // d. tiene que estar en el mismo archivo
  }
};