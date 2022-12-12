package chennai.tambaram;
public class Theatre
{// run -->javac -d . Theatre.java
static String name = "Murali";
int ticket;private int salary = 10000;
Theatre(int ticket)
{
this.ticket = ticket;
}
Theatre()
{
System.out.println("Hi");
}
public static void main(String[] args)
{
Theatre balcony = new Theatre(200);
Theatre first_class = new Theatre(100);
Theatre second_class =  new Theatre(50);
balcony.book_ticket();
first_class.book_ticket();
Theatre employee = new Theatre();
System.out.println(employee.salary);
employee.getSalary();


}
public void book_ticket()
{
System.out.println("Booking ticket for Rs" + ticket);

}

void get_Counter_ticket();
{
System.out.println("TVS Scooty");
}

private void getSalary()
{
System.out.println("Salary" + this.salary);
}
}
