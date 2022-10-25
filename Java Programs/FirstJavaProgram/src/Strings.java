public class Strings {
    public static void main(String[] args) {
        String name = new String("  John Doe  ");
        System.out.println(name);
        //to find length of string
        int value = name.length();
        System.out.println(value);
        //change to lowercase
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //change to uppercase
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        // trim - remove all space
        System.out.println(name.trim());
        //substring
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,8));
        //replace letters
        System.out.println(name.replace('o','a'));
        System.out.println(name.replace("ohn", "asmine"));
        //starting letters correct or wrong
        System.out.println(name.startsWith("  Jo"));
        System.out.println(name.startsWith("  Ja"));
        //ending letters correct or wrong
        System.out.println(name.endsWith("Doe  "));
        //character at given index
        System.out.println(name.charAt(4));
        //find index number of character - this character where first begins
        System.out.println(name.indexOf('o'));
        System.out.println(name.indexOf("oe"));
        //find index number of character - this after some specific position or index
        String modifiedname = "Jonananan";
        System.out.println(modifiedname.indexOf("an",4));
        System.out.println(modifiedname.indexOf("an",5));
        System.out.println(modifiedname.indexOf("an",6));
        System.out.println(modifiedname.lastIndexOf("an", 5));
        //equals
        System.out.println(name.equals("john"));
        System.out.println(name.equals("  John Doe  "));
        //equals ignores case sensitive
        System.out.println(name.equalsIgnoreCase("  john doe  "));

    }
}
