package Chess;

abstract class Piece {
    //Each piece will have a unique id number
    int id;
    //White or Black
    String color;
    //pawn,bishop,queen,etc.
    String type;

    //dictates how a piece should move
    public abstract void movement();
    
    //mainly for pawns? unique ways of taking.
    public abstract void taking();
}
