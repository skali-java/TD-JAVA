public class TPJAVA1 {
    public static void main(String[] args) {
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;
        int[] tab = {-1,-3,-5,-6,-3};
//        for (int i : tab)
//        {
//            System.out.println(i);
//        }
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < maxVal)
                maxVal = tab[i];
            if(tab[i] > minVal)
                minVal = tab[i];
        }

        System.out.println("Plus petit = "+maxVal);
        System.out.println("Plus grand = "+minVal);
    }
}
