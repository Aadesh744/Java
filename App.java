public class App {
    public static void main(String[] args) throws Exception {
  //creating strings
  String str1 ="Aadesh Yadav";
  String str2 ="Bikesh yadav";
  String str3 ="coimbatore";
  //character  at specifier index
  System.out.println("character at index 5 is:" +str1.charAt(5));
  System.out.println("character at index 4 is:" +str2.charAt(4));
  System.out.println("character at index 7 is:" +str3.charAt(7));
  //Substring 
  System.out.println("Substring of str1 from index 0 to 12:"+str1.substring(0, 12));
  System.out.println("Substring of str2 from index 0 to 12:"+str2.substring(0, 12));
  System.out.println("Substring of str3 from index 0 to 10:"+str3.substring(0, 10));
  }
}
