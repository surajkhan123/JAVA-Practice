package PatternsFinal;

public class B {
  
    public static void main(String[] args) {

         char ch = 'A';

        int[] spaces = {5, 3, 2, 1};
        int[] letters = {1, 2, 2, 7};

        for (int i = 0; i < 4; i++) {

            // print leading spaces
            for (int s = 1; s <= spaces[i]; s++) {
                System.out.print(" ");
            }

            // print letters + symbols
            for (int j = 1; j <= letters[i]; j++) {

                System.out.print(ch);
                ch++;

                if (i == 1 && j == 1) System.out.print("--");
                if (i == 2 && j == 1) System.out.print("---");
                if (i == 3 && j < letters[i]) System.out.print(" ");
            }

            System.out.println();
        }
    }

}
