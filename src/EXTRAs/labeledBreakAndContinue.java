package EXTRAs;

public class labeledBreakAndContinue {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i<10; i++){
            int j = 0;
            while(j<=5){
                if (j==3) break outerLoop;
                System.out.print(j+ " ");
                j++;
            }
            System.out.println();
            // inner loop toh exit hoga he hoga.. lekin jo loop labeled haii vaha ka entire block exit ho jayga...
            //  break outerLoop; will immediately exit the labeled loop — i.e., outerLoop and everything inside it,
            //  no matter how many nested loops or statements are inside.
            // yeh practice discouraged kiya jata hai to use label
        }
    }
}
