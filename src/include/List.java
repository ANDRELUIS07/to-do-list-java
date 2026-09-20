package include;
import java.io.*;
import java.util.Vector;
import java.util.Scanner;

public class List {
    private Vector<Task> list = new Vector<>();
    private final File file = new File("Listtasks.csv");

    public List(){
        try{
            if(file.createNewFile()){
                System.out.println("Arquivo criado!");
            }else System.out.println("Arquivo já existe!");
        }catch (IOException e) {
            System.err.println("Erro ao criar o arquivo!");
        }
    }
    private void read(){
        try (BufferedReader buffer = new BufferedReader(new FileReader("Listtasks.csv"))) {
            String line;
            while((line = buffer.readLine()) != null){
                //ler 5 paginas; true
                String[] parts = line.split(";");
                String name = parts[0].trim();
                boolean status = Boolean.parseBoolean(parts[1].trim());
                Task t = new Task(name, status);
                addTask(t);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(){
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter("Listtasks.csv"))){
            for(Task l : list){
                String line = l.getName() + ";" + l.getStatus() + "\n";
                buffer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addTask(Task task){
        this.list.add(task);
    }

    public void removeTask(int index) {
        list.remove(index);
    }

}
