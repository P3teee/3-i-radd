/**
 * Created by bepe14 on 2016-09-09.
 */
public class tictactoe {
    public static void main(String[] args) {
        char[] spelplan = new char[9];

        for (int i = 0 ; i < spelplan.length ; i++) {
            spelplan[i] = " ";
        }


    }

        System.out.println("---------");

        for (int j = 0 ; j < 3 ; j++) {
            System.out.print("| ");
            for (int k = 0 ; k < 3 ; k++) {
                System.out.print(spelplan[j][k] + " | ");
            }
        }
    }

