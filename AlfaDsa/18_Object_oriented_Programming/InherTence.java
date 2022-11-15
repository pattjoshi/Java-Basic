public class InherTence {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves(); // up,down,left,right,digonal(int all 4 Diraction)

    }
}

interface ChacePlayer { // Blue Print
    void moves();
}

class Queen implements ChacePlayer {
    public void moves() {
        System.out.println("up,down,left,right,digonal(int all 4 Diraction) ");
    }
}

class Rook implements ChacePlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChacePlayer {
    public void moves() {
        System.out.println("up,down,left,right,Digonal (by 1 stape)");
    }
}
