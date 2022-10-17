package Basics;

public class StringClassMethod {
	public static void main(String[] args)
		{
			String s1="welcome to the java world ";
			String s2="Welcome to the java world ";
			String s3="";
					System.out.println("1."+s1.equals(s2));
					System.out.println("2."+s1.equalsIgnoreCase(s2));
					System.out.println("3."+s1.toUpperCase());
					System.out.println("4."+s1.concat(s2));
					System.out.println("5."+s1.charAt(3));
					
				    char array[]=s1.toCharArray();
				    for(int i=0;i<array.length;i++) {
				    System.out.println(array[i]);}
					System.out.println("7."+s1.indexOf("j"));
					//System.out.println("8."+s1.format(s1));
					System.out.println("9."+s3.isEmpty());
					System.out.println("10."+s1.contains("to"));
					System.out.println("11."+s1.length());
					System.out.println("12."+s1.replace("java", "Tharani"));
					System.out.println("13."+s1.trim());
					System.out.println("14."+s1.startsWith(" welcome"));
					System.out.println("15."+s1.endsWith("world"));
					System.out.println("16."+s1.substring(15));
					System.out.println("17."+s1.codePointAt(0));
				System.out.println(s1.split(" "));
		
				
			}
		}




