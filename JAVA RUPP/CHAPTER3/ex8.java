public class ex8 {
    public static void main(String[] args) {
      boolean[] locker = new boolean[51];
      boolean open = true;
      boolean closed = false;
      int length = locker.length;
      //Player 1 open all the lockers
      for (int i = 1; i < length; i++) {
          locker[i] = open;
      }
      //Player 2 close all the lockers ,except locker 1
      for (int i = 2; i < length; i++) {
        locker[i] = closed;
      }
  
      //change the status of locker (closed -> open) and (open -> closed)
      for (int i = 3; i <= length -1; i++) {
          for (int j = 1; i * j <= length-1; j++) {
              if(locker[i * j] == open)
              {
                locker[i * j] = closed;
              }
              else
              {
                locker[i * j] = open;
              }
  
          }
      }
      int countOpen = 0 ;
      // Display locker that still open at the end of the game .
      for (int i = 1; i < length; i++) {
          if (locker[i] == open)
          {
            countOpen ++;
            System.out.println("locker " + i + " is open.");
          }
      }
      // display total of opened locker
      System.out.println("The total of opened locker is " + countOpen);
    }
    
  }
  