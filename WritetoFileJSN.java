// JSON:

// {
// "Иван Иванов": 4.8,
// "Мария Кузнецова": 5.0,
// "Степан Кузьмин": 3.6
// }
import java.io.IOException;
import java.util.List;
import java.io.FileWriter;

public class WritetoFileJSN extends WriterofFile{

    public WritetoFileJSN(List<Student> students) {
        super(students);
    }
    
    public void save(String nameFile){
        
        try(FileWriter writer = new FileWriter(nameFile + ".jsn", false))
        {
            writer.write("{\n");
            for(Student student:students){
                writer.write(student.getName() + "=" + student.getAverageScore() + "\n");  
            }
            writer.write("}\n");
            
            writer.flush();
        }
        catch(IOException ex){
        }  
    }

  
    
}
