public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        StringBuilder myTodo = new StringBuilder(todoText);
        myTodo.insert(0, "\n My todo: \n");
        myTodo.insert(23, "\n - Download Games\n");
        myTodo.insert(41, "\n    - Diablo 4\n");
        todoText = myTodo.toString();
        System.out.println(todoText);
    }
}
// \n creates a new line