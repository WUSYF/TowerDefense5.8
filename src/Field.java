public class Field {
    int sizeX;
    int sizeY;
    int[][] fields;

    public Field(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fields = new int[sizeX][sizeY];
    }
}
