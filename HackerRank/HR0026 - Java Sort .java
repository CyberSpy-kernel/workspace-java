import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class CGPAComporator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(Double.valueOf(o1.getCgpa()).equals(Double.valueOf(o2.getCgpa()))){
            return 0;
        }else if(o1.getCgpa() > o2.getCgpa()){
            return -1;
        }else {
            return 1;
        }
    }
}
class Checker implements Comparator<Student>{
    
    @Override
    public int compare(Student s, Student s2){
        if(s.getCgpa() == s2.getCgpa()){
            if(s.getFname().equals(s2.getFname())){
                return s.getId() - s2.getId() > 0 ? 1: -1;
            }else
                return s.getFname().compareTo(s2.getFname());
        }else
            return s2.getCgpa() - s.getCgpa() > 0 ? 1 : -1;
        
    }
}
//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
        Collections.sort(studentList, new Checker());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



