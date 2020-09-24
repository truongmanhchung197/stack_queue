import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Queue<Object> male = new LinkedList<>();
        Queue<Object> female = new LinkedList<>();
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Cristiano Ronaldo", "male", 19850205));
        arrayList.add(new Employee("Lionel Messi", "male", 19870624));
        arrayList.add(new Employee("Gareth Bale", "male", 19890716));
        arrayList.add(new Employee("Serena William", "female", 19810926));
        arrayList.add(new Employee("Venus William", "female", 19800617));
        arrayList.add(new Employee("Maria Sharapova", "female", 19870419));
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Employee) arrayList.get(i)).getGender().equals("male")) {
                male.add(arrayList.get(i));
            } else {
                female.add(arrayList.get(i));
            }
        }

    }
}
