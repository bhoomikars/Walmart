import java.util.*;

public class Main1
{
    public static void main (String[] args)
    {
        String s = "abc";
        char[] arr = new char[s.length()];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        HashMap<Character, Boolean> used = new HashMap<>();
        List<String> result = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            used.put(arr[i], false);

        }

        List<String> resu = permu(result, arr, list1, used, s);
        System.out.println(resu);

    }

    public static List<String> permu (List<String> result,
                                      char[] arr,
                                      List<Character> list,
                                      HashMap<Character, Boolean> used,
                                      String s)
    {
        if (list.size() == arr.length) {
            List<Character> newl = new ArrayList<>(list);
            String str = "";
            for (int i = 0; i < list.size(); i++) {
                str = str + list.get(i);
            }
            result.add(str);

        }

        for (int i = 0; i < arr.length; i++) {
            if (used.get(arr[i]) == false) {
                char c = s.charAt(i);
                list.add(c);
                used.put(c, true);
                permu(result, arr, list, used, s);
                used.put(c, false);
                list.remove(list.size() - 1);

            }
        }
        return result;

    }

}
