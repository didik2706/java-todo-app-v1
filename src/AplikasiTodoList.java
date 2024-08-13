public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
    }

    // untuk menampilkan todo list
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus : Aplikasi Todo List";
        showTodoList();
    }

    // untuk menambahkan data ke todo list
    public static void addTodoList(String todo) {
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var tempModel = model;
            model = new String[model.length * 2];

            for (int i = 0; i < tempModel.length; i++) {
                model[i] = tempModel[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo Ke. " + i);
        }

        showTodoList();
    }

    // untuk menghapus data dari todo list
    public static void removeTodoList() {

    }

    // menampilkan view todo list
    public static void viewShowTodoList() {

    }

    // menampilkan view add todo list
    public static void viewRemoveTodoList() {

    }
}
