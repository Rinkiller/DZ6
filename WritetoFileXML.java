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
import java.io.IOException;
import java.util.List;
import java.io.FileWriter;
class WriterofFileXML extends WriterofFile{

    public WriterofFileXML(List<Student> students) {
        super(students);
    }
    public void save(String nameFile){
        
        try(FileWriter writer = new FileWriter(nameFile + ".xml", false))
        {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write("<students>\n");
            
            
            for(Student student:students){
                writer.write("<student>\n");
                writer.write(String.format("<name>%s</name>\n", student.getName())); 
                writer.write(String.format("<grade>%.1f</grade>\n", student.getAverageScore())); 
                writer.write("</student>\n"); 
            }
            writer.write("</students>\n");
            
            writer.flush();
        }
        catch(IOException ex){
        }  
    }
}