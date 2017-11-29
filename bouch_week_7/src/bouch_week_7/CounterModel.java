/*
Damian Bouch
CIT 130
Week 7
Due: October 28, 2017
 */
//package bouch_week_7;
import java.util.Timer;
import java.util.TimerTask;
public class CounterModel 
{
    private int counter;
    private int limitCounter;
    
    public CounterModel(int initialValueIn, int limitIn)
    {
        counter = initialValueIn;
        limitCounter = limitIn;
    }    

    public void Increment()
    {
        CounterView counterView = new CounterView();
        int limit = counter;
        try
        {
            for(int i = 0; i < limitCounter; i++)
            {
                counter++;
                counterView.Display(counter);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Increment was interrupted.");
        }
        
    }
    
    
}
