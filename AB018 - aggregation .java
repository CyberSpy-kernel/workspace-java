
class Address {
  String city, state, country;
  public Address(String city, String state, String country) {
    this.city = city;
    this.state = state;
    this.country = country;
  }
}
public class P021 {  // P021 = Aggregation
  
  int id;
  String name;
  Address address;

  AB018(int id, String name, Address address) {  // AB018 = Aggregation
    this.id = id;
    this.name = name;
    this.address = address;
    
  }
  void display() {
    System.out.println("ID: "+id+" Name: "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
  }
  public static void main(String[] args) {
    Address add1 = new Address("mumbai", "Maharashtra", "India");
    Address add2 = new Address("xyz", "abc", "qwe");

    P021 emp1 = new P021(101, "jack", add1);  // P021 = Aggregation
    P021 emp2 = new P021(102, "hack", add2);  // P021 = Aggregation
    
    emp1.display();
    emp2.display();
  }
}
