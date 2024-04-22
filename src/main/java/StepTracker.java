import java.util.ArrayList;
public class StepTracker
{
 private int min, adder = 0, divider = 0, dayCounter = 0;
 StepTracker(int a){
  min = a;
 }
 public void addDailySteps(int b){
  adder = adder + b;
  divider++;
  if (b >= in){
    dayCounter++;
  }
 }
 public int activeDays(){
  return dayCounter;
 }
 public double averageSteps(){
  if(divider == 0){
    return 0;
  }
  return ((double)adder/divider);
 }
} 
