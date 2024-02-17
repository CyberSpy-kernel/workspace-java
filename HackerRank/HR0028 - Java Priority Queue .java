import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
class Student{
    private int id;
    private String name;
    private double cgpa;
    
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCGPA(){
        return this.cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String>events){
        List<Student> result = new ArrayList<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>(){
            
            public int compare(Student s1, Student s2){
                if(s1.getCGPA() != s2.getCGPA())
                    return s2.getCGPA() - s1.getCGPA() > 0 ? 1 : -1;
                else{
                    if(!s1.getName().equals(s2.getName())) return s1.getName().compareTo(s2.getName());
                    else return s1.getId() < s2.getId() ? 1: -1;
                }
            }
        });
        
        for(String e:events){
            String operator = e.split(" ")[0];
            if(operator.equals("ENTER")){
                String name = e.split(" ")[1];
                double cgpa = Double.parseDouble(e.split(" ")[2]);
                int id = Integer.parseInt(e.split(" ")[3]);
                
                pq.add(new Student(id, name, cgpa));
            }else{
                pq.poll();
            }            
        }
        
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        
        return result;
        
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
