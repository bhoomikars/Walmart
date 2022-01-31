import java.lang.reflect.Array;
import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3);
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        list.stream().forEach(s-> System.out.println(s));
        list.parallelStream().forEach(s-> System.out.println(s));

        String str = "abc";
        StringBuilder sb = new StringBuilder(str);//not syc/not
        sb.reverse();
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        set.add(1);

        Employ e1 = new Employ(1,"bhoomika",122);
        Employ e2 = new Employ(2,"abc",32);
        Employ e3 = new Employ(3,"cbgg",42);
        List<Employ> list1= Arrays.asList(e1,e2,e3);
        Collections.sort(list1,Comparator.comparing(employ -> employ.name));
        System.out.println(list1);
//        sleep(1000);
//        wait();

Singleton.getInstnce();
//SOLID;


    }

    public void printTree(TreeNode root)
    {
//        1 2 3
//        / process(right)
//            proocess(left)
//            root

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        boolean LTR=true;
        while (!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++)
            {
                TreeNode curNode = q.remove();
                if(LTR)
                {
                   list.add(curNode.val);
                }
                else {
                    list.add(0, curNode.val);
//                   3, 2

                }
                if(root.left!=null)
                {
                    q.add(root.left);
                }
                if(root.right!=null)
                {
                    q.add(root.right);
                }
            }
            res.add(list);
            LTR=!LTR;
        }
    }


    public void post(TreeNode root)
    {
        if(root==null)
            return;
        else
        {
            post(root.left);
            post(root.right);
            System.out.println(root.val);
        }
    }
}
    
