public class Board {

    private final static int MAX_SQ = 40;
    private Square[] squares = new Square[MAX_SQ];

    //constructor
    public Board(){
        squares[0] = new Square("Go");

        for (int i = 1; i < MAX_SQ ; i++) {
            String str = "Square ";
            str += i;
            squares[i] = new Square(str);

        }


    }

    public Square getNextSquare(Square current, int fv){
        // check the parameters
        if(fv < 2 || fv > 12 ){
            throw new IllegalArgumentException("Face value must be between 2 and 12 with 2 dice");
        }
        if(current == null){
            throw new IllegalArgumentException("Square can't be null");
        }

        int position;
        String currentPos = current.getName();

        //need to iterate over the board to find the index of the position
        for (int i = 0; i < MAX_SQ ; i++) {
            if(currentPos.equals(squares[i].getName())){
                // we found our current index
                position = (i + fv)%MAX_SQ;
                return squares[position];
            }

        }
        // we found nothing
        return null;
    }

    public Square getSquare(int position){
        if (position >= 40 || position < 0){
            throw new IllegalArgumentException("the square number should be from 0 to 39");
        }

        return squares[position];
    }

}
