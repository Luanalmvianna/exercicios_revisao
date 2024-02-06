/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
 *
 * @author 975551

public class JavaApplication3 {


     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
       
        //exercício 1
        System.out.println("Hello World!");
        
        //exercício 2
        // comentário 1
        /* comentário 2 */
   /*     
    
        //exercício 3
        String carName = "Volvo";
        
        //exercício 4
        int maxSpeed = 120;
        
        //exercício 5
        int x = 5;
        int y = 10;
        System.out.println(x+y);
        
        //exercício 6
        int x = 5;
        int y = 10;
        int z = x +y;
        System.out.println(z); 
        
        //exercício 7
        int x = 5, y=6, z=50;
        System.out.println(x+y+z); 
        
        
        //exercício 8
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        char myText = "Hello World";
        
        //exercício 9
        //primitive data types
                
        //exercício 10
        double myouble = 9.78d;
        int myInt = Integer.parseInt(myDouble); 
        
        //exercício 11
        System.out.println(10*5); 
        
        //exercício 12
        System.out.println(10/5);
        
        //exercício 13
        int x = 10;
        ++x;
        
        //exercício 14
        int x = 10;
        x += 5;
        
        //exercício 15
        String greeting = "Hello";
        
        
        //exercício 16
        String txt = "Hello";
        System.out.println(txt.toUpperCase()); 

        //exercício 17
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
        
        //exercício 18 
        String firstName = "John";
        String lasName = "Doe";
        System.out.println(firstName.concat(lasName)); 
        
        //exercício 19
        String txt = "Hello everybody";
        System.out.println(txt.indexOf("e"));
        
        //exercício 20
        int x = 5;
        int y = 10;
        Math.max(x, y); 
        
        //exercício 21
        int x = 16;
        Math.sqrt(x); 
        
        //exercício 22
        //Math.random();
        
        //exercício 23
       boolean isJavaFun = true;
       boolean isFishTasty = false;
       System.out.println(isJavaFun);
       System.out.println(isFishTasty);
       
       //exercício 24
       int x = 10;
       int y = 9;
        System.out.println(x > y);  
       
        //exercício 25
        int x = 50;
        int y = 10;
        if(x>y){
            System.out.println("Hello World");
        }
        
        //exercício 26
        int x = 50;
        int y = 50;
        if (x == y){
            System.out.println("Hello World"); 
        }
        
        //exercício 27
        int x = 50;
        int y = 50;
        if (x == y){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        //exercício 28
        int x = 50;
        int y = 50;
        if (x == y){
    System.out.println("1");
    }if (x>y){
    System.out.println("2");
}else{
    System.out.println("3");
}
    
    //exercício 29
    int time = 20;
 String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result); 
   
     //exercício 30
     int day = 2;
             switch (day){
                 case 1:
                     System.out.println("Saturday");
                     break;
                 case 2:
                     System.out.println("Sunday");
                     break;
             } 
             
          //exercício 31
          int day = 4;
           switch (day){
                 case 1:
                     System.out.println("Saturday");
                     break;
                 case 2:
                     System.out.println("Sunday");
                     break;
                 default:
                     System.out.println("Weekend");
                     
            //exercício 32
            int i = 1;
            if (i < 6){
                System.out.println(i);
                i++;
            } 
            
             //exercício 33
            int i = 1;
            do {System.out.println(i);
            i++;
            }
            while (i <6); 
            
             //exercício 34
             for (int i = 0; i <5; i++){
                 System.out.println("Sim");
             }
                     
              //exercício 35
              String [] cars = {"Volvo", "BMW", "Ford"};
              for (String i: cars){
                  System.out.println(i);
              }
              
               //exercício 36
               for (int i = 0; i <10; i++){
                   if (i == 5){
                    break;   
                   }
                   System.out.println(i);
               }
               
                //exercício 37
                for (int i = 0; i < 10; i++){
                    if (i == 4){
                      continue;  
                    }
                    System.out.println(i);
                }
              
                 //exercício 38
                 String [] cars = {"Volvo", "BMW", "Ford"};
                 
                  //exercício 39
                   String [] cars = {"Volvo", "BMW", "Ford"};
                   System.out.println(cars);
                   
                   //exercício 40
                   String[] cars = {"Volvo", "BMW", "Ford"};
                   cars[0] = "Opel";
                    System.out.println(cars[0]);
                    
                    //exercício 41
                    String[] cars = {"Volvo", "BMW", "Ford"};
                    System.out.println(cars.length);
                    
                    //exercício 42
                    String[] cars = {"Volvo", "BMW", "Ford"};
                    for (String i : cars) {
                    System.out.println(i);
                     }
                    
                    //exercício 43
                    int [][] myNumbers = { {1,2,3,4},{5,6,7} };
    
                   /* 
                    //exercício 44             
                    static void myMethod() {
                       System.out.println("I just got executed!");
                     }

                     public static void main(String[] args) {
                       myMethod();
                     }
                     
                     //exercício 45
                     static void myMethod() {
                        System.out.println("I just got executed!");
                      }

                      public static void main(String[] args) {
                        myMethod();
                        myMethod();
                      }
        
                      //exercício 46
                      static void myMethod(String fname) {
                        System.out.println(fname + " Doe");
                      }

                      public static void main(String[] args) {
                        myMethod("John");
                      }
        
                      //exercício 47
                      static int myMethod(int x) {
                        return 5 + x;  
                      }
                      
                      public static void main(String[] args){
                          System.out.println(myMethod(3));
                      }
                      
                      //exercício 48
                      public class MyClass
                      
                      //exercício 49
                      MyClass myObj = new MyClass();
                      
                      //exercício 50
                      public class MyClass{
                          int x = 5;
                          
                          public static void main(String[] args){
                              MyClass myObj = new MyClass();
                              System.out.println(myObj.x);
                          }
                      }
                      
                      //exercício 51
                      public class MyClass{
                      public void myMethod(){
                          System.out.println("Hello World");
                      }
                      
                      public static void main(String[] args){
                          MyClass myObj = new MyClass();
                          myObj.myMethod();
                      }
                      }
                      
                      //exercício 52
                      //Create a MyClass class
                      public class MyClass{
                          int x; // Create a class attribute x
                          
                          //Create a class constructor for the MyClass class
                          public MyClass{
                          x = 5; // Set the initial value for the class attribute x to 5
                      }
                          
                          public static void main(String[] args) {
                              //Create an MyObj object of class MyClass (This will call the constructor)
                              MyClass myObj = new MyClass();
                              //Print the value of x
                              System.out.println(myObj.x);
        
                        //exercício 53
                        final class MyClass
                                
                        //exercício 54
                        import java.util.Scanner;
                        import java.sql.Connection;*/
                        
                        //execício 55
                        //class car extends vehicle;
                      
    }
}
