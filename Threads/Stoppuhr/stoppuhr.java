import java.util.*;
import java.text.*;

public class stoppuhr extends Thread {
  private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
  
  public void run() {
    while (!isInterrupted()) {
      Date time = new Date();
      System.out.println(sdf.format(time));
      try {
        sleep(1000);
      }
      catch(InterruptedException e) {
        System.out.println(e.getMessage());
        interrupt();
      }
    }
  }
}
