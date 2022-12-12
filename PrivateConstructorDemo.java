class PrivateConstructorDemo
{

private PrivateConstructorDemo()
{
System.out.println("Hi"); 
}

public static void main(String[] args)
{
PrivateConstructorDemo pcd = new PrivateConstructorDemo(); 

}

}
