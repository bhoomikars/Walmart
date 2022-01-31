public class Employ
{
    int id;
    String name;
    int age;

    @Override public String toString ()
    {
        return "Employ{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    public Employ (int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
