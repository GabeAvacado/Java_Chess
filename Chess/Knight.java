package Chess;

class Knight extends Piece {

    @Override
    // Knights move in an L shape that is two squares in any direction vertically followed by one square horizontally
    // or two squares any direction horizontally followed by one square vertically
    public void movement() {
        // Knights can "jump" over pieces so no need to check if a piece is in the way
        // TODO Check that a friendly piece isn't on the destination square
        // TODO Check that moving doesn't put king in danger
        
    }

    @Override
    // Knights take in the same way they move on their destination square
    public void taking() {
        // TODO Check that moving doesn't put king in danger
        
    }
    
}
