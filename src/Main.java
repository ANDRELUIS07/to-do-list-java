import include.*;

public class Main {
    public static void main(String[] args) {
        Task t = new Task("jogar", true);
        Task u = new Task("uau");
        Task v = new Task("dede gay");
        List list = new List();
        list.addTask(t);
        list.addTask(u);
        list.addTask(v);
        list.addTask(new Task("dede deu o toba"));
        list.write();
    }
}
