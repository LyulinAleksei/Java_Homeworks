 class Lesson1 {
	 public static void main(String[] args) {
		 printThreeWords();
        	 checkSumSign();
        	 printColor();
        	 compareNumbers();
	 }
	 public static void printThreeWords() {
		 System.out.println("Orange");
       		 System.out.println("Banana");
       		 System.out.println("Apple");
         }
	 public static void checkSumSign() {
		 int a = -5;
                 int b = -10;
                 System.out.println(a + b >= 0?  "Сумма положительная" :  "Сумма отрицательная" );
	 }
	 public static void printColor() {
		 int value = 101;
		 if (value <=0) {
                 System.out.println ("Красный");
		 }
		 else if (value >0 && value <=100) {
	         System.out.println ("Желтый");
		 } else {
                 System.out.println ("Зеленый");    
		 }    
	 }
	 public static void compareNumbers() {
		 int a = 5;
		 int b = 5;
                 System.out.println(a >= b?  "a >= b" :  "a < b" ); 
	 }
 }
      
