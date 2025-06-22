import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("08:00 daniel");
        horarios.add("10:00 lucas");
        horarios.add("12:00 ercio");
        horarios.remove(1);
        horarios.add("14:00 debora");

        System.out.println(horarios.get(1));
    }
}