import java.util.Comparator;

public class AgeComparator implements Comparator<Employ>
{
    @Override public int compare (Employ o1, Employ o2)
    {
        if(o1.age==o2.age)
            return 0;
        else if(o1.age>o2.age)
            return 1;
        else
            return -1;
    }
}
