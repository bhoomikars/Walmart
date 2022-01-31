public class Singleton
{
    static Singleton obj;
    private Singleton()
    {

    }

    public static synchronized Singleton getInstnce()
    {
        synchronized(Singleton.class) {
            if (obj == null) {
                 obj = new Singleton();
            }
            return obj;
        }
    }

}
