public class TestingMain
{
    private FormattedDateAndTime timeAndDate;

    public TestingMain()
    {
        run();
    }

    public static void main(String[] args) 
    {
        new TestingMain();
        
    }
    
    private void run()
    {
        timeAndDate = new FormattedDateAndTime();
        System.out.println(timeAndDate.getFormattedDate());
    }
}
