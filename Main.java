
import java.util.ArrayList;
import java.util.List;

// Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).

// Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:

// Просто текст:

// Иван Иванов=4.8
// Мария Кузнецова=5.0
// Степан Кузьмин=3.6

// JSON:

// {
// "Иван Иванов": 4.8,
// "Мария Кузнецова": 5.0,
// "Степан Кузьмин": 3.6
// }

// XML:

// <?xml version="1.0" encoding="utf-8" ?>
// <students>
// <student>
// <name>Иван Иванов</name>
// <grade>4.8</grade>
// </student>
// <student>
// <name>Мария Кузнецова</name>
// <grade>5.0</grade>
// </student>
// <student>
// <name>Степан Кузьмин</name>
// <grade>3.6</grade>
// </student>
// </students>

class Main{
    public static void main(String[] args) {
        Student st1 = new Student("Иван Иванов",  4.8);
        Student st2 = new Student("Мария Кузнецова",  5.0);
        Student st3 = new Student("Степан Кузьмин",  3.6);
        List<Student> students = new ArrayList<>(3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println(students);
        WritetoFileTXT txt = new WritetoFileTXT(students);
        txt.save("Students");
        WritetoFileJSN jsn = new WritetoFileJSN(students);
        jsn.save("Students");
        WriterofFileXML xml = new WriterofFileXML(students);
        xml.save("Students");
    }
}