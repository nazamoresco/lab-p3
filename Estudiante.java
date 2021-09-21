import java.util.Arrays;
import java.util.Comparator;

public class Estudiante {
  public String apellido;
  public String nombre;
  public int edad;
  public String legajo;
  public int materiasAprobadas;

  public Estudiante(String apellido, String nombre, int edad, String legajo, int materiasAprobadas) {
    this.apellido = apellido;
    this.nombre = nombre;
    this.edad = edad;
    this.legajo = legajo;
    this.materiasAprobadas = materiasAprobadas;
  }

  static public Comparator<Estudiante> sortByName() {
    return new Comparator<Estudiante>() {
      public int compare(Estudiante e1, Estudiante e2) {
        boolean nameIsEqual = e1.nombre.equals(e2.nombre);
        int nameIsLower = e1.nombre.compareTo(e2.nombre) * -1;
        int apellidoIsLower = e1.apellido.compareTo(e2.apellido) * -1;

        return (nameIsEqual) ? apellidoIsLower : nameIsLower;
      }
    };
  }

  static public Comparator<Estudiante> sortByMateriasAprobadas() {
    return new Comparator<Estudiante>() {
      public int compare(Estudiante e1, Estudiante e2) {
        return e1.materiasAprobadas - e2.materiasAprobadas;
      }
    };
  }

  static public Comparator<Estudiante> sortByEdad() {
    return new Comparator<Estudiante>() {
      public int compare(Estudiante e1, Estudiante e2) {
        return e2.edad - e1.edad;
      }
    };
  }

  static public Comparator<Estudiante> sortByLegajo() {
    return new Comparator<Estudiante>() {
      public int compare(Estudiante e1, Estudiante e2) {
        return e1.legajo.compareTo(e2.legajo);
      }
    };
  }

  public String toString() {
    return nombre + " " + apellido + " " + edad + " " + legajo + " " + materiasAprobadas;
   }

  public static void main(String[] args) {
    Estudiante e1 = new Estudiante("Moresco", "Nazareno", 22, "16045/1", 1);
    Estudiante e2 = new Estudiante("Moresco", "Aazareno", 23, "16045/0", 5);
    Estudiante e3 = new Estudiante("Aoresco", "Aazareno", 27, "16245/0", 15);

    Estudiante[] estudiantes = { e1, e2, e3 };

    Arrays.sort(estudiantes, Estudiante.sortByMateriasAprobadas());
    System.out.println("Estudiantes por materias aprobadas");
    for (int i = 0; i < estudiantes.length; i++) {
      System.out.println(estudiantes[i]);
    }

    Arrays.sort(estudiantes, Estudiante.sortByEdad());
    System.out.println("Estudiantes por edad");
    for (int i = 0; i < estudiantes.length; i++) {
      System.out.println(estudiantes[i]);
    }

    Arrays.sort(estudiantes, Estudiante.sortByLegajo());
    System.out.println("Estudiantes por legajo");
    for (int i = 0; i < estudiantes.length; i++) {
      System.out.println(estudiantes[i]);
    }

    Arrays.sort(estudiantes, Estudiante.sortByName());
    System.out.println("Estudiantes por nombre");
    for (int i = 0; i < estudiantes.length; i++) {
      System.out.println(estudiantes[i]);
    }
  }
}
