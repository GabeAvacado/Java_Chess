package Chess;

class Pawn extends Piece {

    @Override
    // Pawns can move up to two spaces for their first turn
    // After first turn, they can only move one space
    public void movement() {
        // TODO: Need way to tell if it's the pawns first time to move
        // TODO: Check if another piece is in the way
        // TODO: Add a check if taking puts king in danger which would be an illegal move
    }

    @Override
    // Pawns can take a piece only if it is diagonally above to right or left. (Above means in the way the pawn travels up the board)
    public void taking() {
        // TODO: Add a check if taking puts king in danger which would be an illegal move
        
    }
    
}
