package Lesson1;

public class LessonOneHomework {
    public static void main(String[] args) {
        Author[] ourAutor = new Author[10];
        Book[] books = new Book[100];
        ourAutor[0] = new Author("Пушкин", "Александр", "Сергеевич");
        ourAutor[1] = new Author("Толстой", "Лев", "Николаевич");
        ourAutor[2] = new Author("Толстой", "Алексей", "Николаевич");
        books[0] = new Book("Евгений Онегин", ourAutor[0], 1992);
        books[1] = new Book("Избранное", ourAutor[0], 1987);
        books[2] = new Book("Война и мир", ourAutor[1], 1985);
        books[3] = new Book("Анна Каренина", ourAutor[1], 1989);
        books[4] = new Book("Гиперболоид инженера Гарина", ourAutor[2], 1979);
        books[5] = new Book("Хождение по мукам", ourAutor[2], 1983);
        System.out.println("Список книг:");
        for (int i = 0; i < 6; i++) {
            System.out.println(books[i].getFullInfoBook());
        }
        books[5].setYearPublication(2000);
        System.out.println("ОШИБКА исправлена:");
        System.out.println(books[5].getFullInfoBook());
        System.out.println("Список авторов:");
        for (int i = 0; i < 3; i++) {
            System.out.println(ourAutor[i].getFullName());
        }
    }
}
