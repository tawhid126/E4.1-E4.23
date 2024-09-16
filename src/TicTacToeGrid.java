
public class TicTacToeGrid {
    public static void main(String[] args) {
        String comb = "+--+--+--+";
        String bottomLine = "|  |  |  |";

        for (int i = 0; i < 3; i++) {
            System.out.println(comb);
            System.out.println(bottomLine);
        }
        System.out.println(comb);
    }
}