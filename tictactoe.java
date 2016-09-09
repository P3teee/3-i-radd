/**
 * Created by bepe14 on 2016-09-09.
 */
public class tictactoe {
    public static void main(String[] args) {
        char[] spelplan = new char[9];



        System.out.println("---------");

        for (int j = 0; j < 3; j++) {
            System.out.print(" | ");
            for (int i = 0; i < 3; i++) {
                System.out.print(spelplan[j + 3 + i]);
                if (i < 2) {
                    System.out.print(' ');
                }
            }


        }
    }

}

