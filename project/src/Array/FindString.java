package Array;


public class FindString {
public static void main(String[] args) {
	
	boolean isExist =false;
	String findName="Tamil";
	String a[]= {"Tharani","Sorna","Tamil","Aruna"};
	for (int i = 0; i < a.length; i++) {
		if(findName==a[i]) {isExist=true;
		break;
		}}
		
	if(isExist==true)	
	{
	System.out.println("Name Found");

} else
	System.out.println("Name not Found");


}
}