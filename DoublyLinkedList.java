import java.util.Scanner;
import java.util.*;
class DoublyLinkedList
{
public static void main(String[] args)
{
LinkedList<Integer> list = new LinkedList<>();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of Elements:");
int n = sc.nextInt();
System.out.println("Enter Elements:");
for(int i=0; i < n; i++){
list.add(sc.nextInt());
}
System.out.println("Original List: "+list);
System.out.println("Enter Element To Delete:");
int x = sc.nextInt();
if(list.remove(Integer.valueOf(x))){
System.out.println("List After Deletion: "+list);
}
else{
System.out.println("Element Not Found");
}
sc.close();
}
}