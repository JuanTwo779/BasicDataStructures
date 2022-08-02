import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.addFirst("Hello");
        list.addLast("Juan Antonio");
        list.add(2, "Sup");
        list.add(3, "Putangina mo");
        list.remove(3);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));

        }

    }
}