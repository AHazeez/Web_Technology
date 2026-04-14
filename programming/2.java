class CurrectD_T{
public static void main(String[] args){ 
    int currentYear = java.time.Year.now().getValue();
    int birthYear = 1990; // Example birth year
    int age = currentYear - birthYear;
    System.out.println("Age: " + age);
}
 
}


    
