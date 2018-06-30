package stack;

public class StackTest {
    public static void main(String[] args) {
        ArrayStack <Integer> stack = new ArrayStack<>(10);


        System.out.println("Is empty: " + stack.isEmpty()); // sprawdzamy czy stos jest pusty
        stack.push(9); // dolozenie elementu do stosu
        System.out.println("Is empty: " + stack.isEmpty()); //po dolozeniu elementu stos nie jest pusty
        System.out.println("Stack top: " + stack.peek()); // wyswietlenie ostatniego dolozonego elementu
        stack.push(4); // dodanie kolejnego elementu, ktory jest na samej gorze stosu
        System.out.println("Stack top: " + stack.peek()); //wysweitlenie nowego ostatniego elementu
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(234);
        stack.push(45);
        System.out.println("top: " + stack.peek());
        stack.push(78);
        System.out.println("top: " + stack.peek());

       Box<String, Integer> box =
               new Box<>("Tekst", 10);
       Box<Integer, Person> box2 =
               new Box<>(22, new Person("Janusz",41));
       Box<Person,Person> box3 =
               new Box<>(new Person("Jola",24), new Person("Bożydar",71));
        System.out.println(box.getElement() + box.getNumber());
        System.out.println(box2.toString());
        System.out.println(box3.toString());

        /*LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(4);
        linkedStack.push(8);

        System.out.println(linkedStack.peek());*/
    }
}
