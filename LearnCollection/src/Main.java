import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Manoj");
        studentList.add("Ajay ");
        //Size = n
        // size = n+n/2+1
        System.out.println(studentList);
        studentList.add(1,"Manish");
        System.out.println(studentList);
        List<String> list  = new ArrayList<String>();
        list.add("Hi");
        list.add("How are you?");
        studentList.addAll(list);
        System.out.println(studentList);

        System.out.println(studentList.get(1));

        studentList.remove(0);
        //studentList.remove(Integer.valueOf("Ajay "));//this shouLD work for integer type list
        System.out.println(studentList);
        studentList.set(3,"Akash");
        System.out.println(studentList);

        //Iterate all elements
        for(int i=0; i<studentList.size(); i++){
            System.out.println("list of students are : "+studentList.get(i));
        }
        for(String it : studentList){
            System.out.println("list of students is: "+it);
        }

        Iterator<String> it = studentList.iterator();

        while(it.hasNext()){
            System.out.println("studets "+it.next());
        }

        studentList.clear();
        System.out.println(studentList);
    }
}