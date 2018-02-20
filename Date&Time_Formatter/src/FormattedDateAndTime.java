import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.TimeZone;

public class FormattedDateAndTime
{
    public FormattedDateAndTime()
    {
        //Default
    }

    private Year getYear()
    {
        return java.time.Year.now();
    }

    private LocalDate getDate()
    {
        return LocalDate.now();
    }
    
    private LocalTime getLocalTime()
    {
        return java.time.LocalTime.now();
    }

    private String localTimeToString()
    {
        String localTime = "";
        localTime = localTime + getLocalTime();
        localTime = localTime.substring(0, 8);
        return localTime;
    }

    private TimeZone getTimeZone()
    {
        return TimeZone.getDefault();
    }

    private String timeZoneToString()
    {
        return getTimeZone().getDisplayName();
    }

    private String shortTimeZoneName()
    {
        char[] charArray = timeZoneToString().toCharArray();
        String tZShort = "";
        for(int i=0; i < charArray.length; i++)
        {
            if(Character.isUpperCase(charArray[i]))
            {
                tZShort = tZShort + charArray[i];
            }
        }
        return tZShort;
    }

    private String nameStyleDate(String name)
    {
        String formattedName = "";
        String firstLetter = name.substring(0, 1).toUpperCase();
        String theRest = name.substring(1, 3).toLowerCase();
        formattedName = firstLetter + theRest;
        return formattedName;
    }

    public String getMonthString()
    {
        return "" + getDate().getMonth();
    }

    public String getMonthStringShort()
    {
        return nameStyleDate(getMonthString());
    }

    public String getDayString()
    {
        return "" + getDate().getDayOfWeek();
    }

    public String getDayStringShort()
    {
        return nameStyleDate(getDayString());
    }

    public int getDateInt()
    {
        return getDate().getDayOfMonth();
    }

    public String getFormattedDate()
    {
        return getDayStringShort() + " " + getMonthStringShort() + " " + getDateInt() + " " + localTimeToString() + " " + shortTimeZoneName() + " " + getYear();
    }
}
