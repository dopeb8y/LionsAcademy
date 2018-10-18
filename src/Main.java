public class Main {

    public int wordsCount(String[] words, int len)
    {
        int countNumber = 0;

        for (int i = 0; i < words.length; i++)
        {
            if (words[i].length() == len)
            {
                countNumber++;
            }
        }
        return countNumber;
    }

    public String[] wordsFront(String[] words, int n)
    {
        String[] value = new String[n];

        for (int i = 0; i < n; i++)
        {
            value[i] = words[i];
        }
        return value;
    }

    public int greenTicket(int a, int b, int c) {
        if (a==b && a==c && b==c)
            return 20;
        else if (a!=b && a!=c && b!=c)
            return 0;
        else
            return 10;
    }

    public static void main(String[] args)
    {
        Main obj = new Main();

        int countNumbers = obj.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1);
        System.out.println("Count of the numbers: " + countNumbers);

        countNumbers = obj.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3);
        System.out.println("Count of the numbers: " + countNumbers);

        countNumbers = obj.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4);
        System.out.println("Count of the numbers: " + countNumbers);



        String[] value = obj.wordsFront(new String[]{"a", "b", "c", "d"}, 1);
        System.out.print("The first N strings: ");
        for(int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();

        value = obj.wordsFront(new String[]{"a", "b", "c", "d"}, 2);
        System.out.print("The first N strings: ");
        for(int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();

        value = obj.wordsFront(new String[]{"a", "b", "c", "d"}, 3);
        System.out.print("The first N strings: ");
        for(int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();



        int ticket = obj.greenTicket(1, 2, 3);
        System.out.println("Result: " + ticket);

        ticket = obj.greenTicket(2, 2, 2);
        System.out.println("Result: " + ticket);

        ticket = obj.greenTicket(1, 1, 2);
        System.out.println("Result: " + ticket);
    }
}
