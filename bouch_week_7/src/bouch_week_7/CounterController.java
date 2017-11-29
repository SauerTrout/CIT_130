/*
Damian Bouch
CIT 130
Week 7
Due: October 28, 2017
 */
//package bouch_week_7;

public class CounterController 
{
    private int startValue;
    private int endValue;
    
    public CounterController(int startIn, int endIn)
    {
        startValue = startIn;
        endValue = endIn;
    }
    
    public void Start()
    {
        int counter = endValue - startValue;
        CounterModel counterModel = new CounterModel(startValue, counter);
        counterModel.Increment();
        
    }
}
