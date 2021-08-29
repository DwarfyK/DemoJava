class BinarySearch{
   public static void main(String args[]){
      System.out.println("Binary search on ordered list");
      int OrderList[] = {1 , 2, 4, 5, 6, 8, 12, 25, 27, 30, 10000};

      int NumberIWant = 1;

      // for(int i = 0; i< OrderList.length; i=i+1){
      //   System.out.println(OrderList[i]);
      //   if (OrderList[i] == NumberIWant){
      //     System.out.println("FoundYourNumber");
      //   }
      // }



      int MinIndex = 0;
      int MaxIndex = OrderList.length - 1;

      int currentIndex = 0;
      boolean runLoop = true;

      while(runLoop == true){


        if(currentIndex == (MinIndex + MaxIndex)/2){
          System.out.println("Your number could not be found, fuckhead");
          runLoop = false;
        }

        System.out.println("Current Index: " + currentIndex);
        currentIndex = (MinIndex + MaxIndex)/2;


        if(NumberIWant == OrderList[currentIndex]){
          System.out.println("Your Number Is Found At Index: " + currentIndex);
          runLoop = false;
        } else if(OrderList[currentIndex]>NumberIWant){
          MaxIndex = currentIndex - 1;
        }
        else if(OrderList[currentIndex]<NumberIWant){
          MinIndex = currentIndex + 1;
        }







      }

   }




}
