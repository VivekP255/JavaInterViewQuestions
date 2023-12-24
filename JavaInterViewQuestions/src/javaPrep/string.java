package javaPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class string {
	
	public static void main(String[] args)
	{
		
//		String S = "Vivek";
//		String concat = S.concat("Pawar");
//		System.out.println(S);
//		System.out.println(concat);
		
//		String s = new String("Vivek"); //2 objects are created  -> 1 heap area, 1 in SCP
//		System.out.println(s.intern());
//		String s1 = new String("Vivek"); //1 object is created -> 1 heap area
//		System.out.println(s1.intern());
//		String s2="Vivek";// 0 object created
//		s2.concat("PAWAR");
//		System.out.println(s2.intern());
//		System.out.println(s2.concat("PAWAR"));
//		System.out.println(s2.concat("PAWAR").intern());
		
		//s refers to heap araa object
		String s = new String("Hello");
		//s1 refers to scp area object
		String s1 = s.concat("world");
		//s2 refers to scp area object
		String s2 = s1.intern();
		//s3 refers to scp area object
		String s3 = "Helloworld";
		//s4 refers to scp area object
		String s4 =  s1.intern();
		
		System.out.println(s1 == s2); // true
	      System.out.println(s1 == s4); // true.
	      System.out.println(s1 == s3); // true. 
	      System.out.println(s3 == s4); //true
	      
//			String s = "Vivek";
//			String s1 = new String ("Vivek");
//			String s2 = "Vivek";
//			String s3 = new String ("Vivek");
//			
//			System.out.println(s==s1);
//			System.out.println(s==s2);
//			System.out.println(s1==s3);
//			System.out.println(s1.intern()==s3.intern());
//			
//			
//			String s4= new String("Vivek");
//			String s5 = s4.intern();
//			String s6 = "Vivek";
//
//			System.out.println(s5==s4);
	      
	      	List<String> list1 = Arrays.asList("{\r\n"
	      			+ "    \"glossary\": {\r\n"
	      			+ "        \"title\": \"example glossary\",\r\n"
	      			+ "		\"GlossDiv\": {\r\n"
	      			+ "            \"title\": \"S\",\r\n"
	      			+ "			\"GlossList\": {\r\n"
	      			+ "                \"GlossEntry\": {\r\n"
	      			+ "                    \"ID\": \"SGML\",\r\n"
	      			+ "					\"SortAs\": \"SGML\",\r\n"
	      			+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
	      			+ "					\"Acronym\": \"SGML\",\r\n"
	      			+ "					\"Abbrev\": \"ISO 8879:1986\",\r\n"
	      			+ "					\"GlossDef\": {\r\n"
	      			+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
	      			+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\r\n"
	      			+ "                    },\r\n"
	      			+ "					\"GlossSee\": \"markup\"\r\n"
	      			+ "                }\r\n"
	      			+ "            }\r\n"
	      			+ "        }\r\n"
	      			+ "    }\r\n"
	      			+ "}");
	      	List<String> list2 = Arrays.asList("{\r\n"
	      			+ "    \"glossary\": {\r\n"
	      			+ "        \"title\": \"example glossary\",\r\n"
	      			+ "		\"GlossDiv\": {\r\n"
	      			+ "            \"title\": \"S\",\r\n"
	      			+ "			\"GlossList\": {\r\n"
	      			+ "                \"GlossEntry\": {\r\n"
	      			+ "                    \"ID\": \"SGML\",\r\n"
	      			+ "					\"SortAs\": \"SGML\",\r\n"
	      			+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
	      			+ "					\"Acronym\": \"SGML\",\r\n"
	      			+ "					\"Abbrev\": \"ISO 8879:1986\",\r\n"
	      			+ "					\"GlossDef\": {\r\n"
	      			+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
	      			+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\r\n"
	      			+ "                    },\r\n"
	      			+ "					\"GlossSee\": \"markup\"\r\n"
	      			+ "                }\r\n"
	      			+ "            }\r\n"
	      			+ "        }\r\n"
	      			+ "    }\r\n"
	      			+ "}");

	      	int hash = Objects.hash(list1);
	      	System.out.println(hash);
			int hash2 = Objects.hash(list2);
			System.out.println(hash2);
			
	      
	}


}