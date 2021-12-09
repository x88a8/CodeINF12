import java.util.*;

public class main {
  Date anfang = new Date();
  Thread timer = new stoppuhr();
  timer.start();
  
  try 
  {
    sleep(10000);
  }
  catch (InterruptedException e) {
    System.out.println(e.getMessage());
  }
  
  timer.interrupt();
  Date ende = new Date();
  long laufzeit = ende.getTime() - anfang.getTime();
}
