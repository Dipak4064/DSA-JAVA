public class Exercise {
    //question 1 
    // the answer is 0 because the x^x =0 and x^0 = x when we use xor operation


    //question 2
    //the process of solution is written in rough book
    public static void chnageValue(int a, int b){
        System.out.println("Before the operation:");
        System.out.println("a: "+a+" b: "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After the operation:");
        System.out.println("a: "+a+" b: "+b);
    }
    
    //question 3
    //the process of solution is written in rough book
    //-x = ~x + 1
    //-~x = x + 1
    public static void addOne(int x){
        System.out.println("Before the operation:");
        System.out.println("x: "+x);
        // x = ~x;
        // x = x + 1;
        x = -~x;
        System.out.println("After the operation:");
        System.out.println("x: "+x);
    }
    /*
    //question 4
    public static void characterCaseConversion() {
        // // Convert uppercase character to lowercase
        // for (char ch = 'A'; ch <= 'Z'; ch++) {
        //     System.out.println((char)(ch | ' '));
        //     // prints abcdefghijklmnopqrstuvwxyz
        //     }

        // Convert uppercase character to lowercase
        char uppercase = 'A'; // Example uppercase character
        char lowercase = (char) (uppercase | 32); // Convert to lowercase using bitwise OR
        // Print the result
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Convert lowercase character to uppercase
        char lowercasee = 'a';
        // Example lowercase character
        char uppercasee = (char) (lowercasee & 95); 
        // Convert to uppercase using bitwise AND 
        // Print the result 
        System.out.println("Lowercase: " + lowercasee); System.out.println("Uppercase: " + uppercasee);
        }
    */

    public static void main(String[] args) {
        // chnageValue(5,10);
        // addOne(5);
        // characterCaseConversion();
        
    }
    
}
