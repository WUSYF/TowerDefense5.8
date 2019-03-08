import processing.core.PApplet;

public class Main extends PApplet
{

    public static void main(String[] args) {
        PApplet.main("Main.Main");
    }

    //global Variables
    int widthProj = 800;
    int heightProj = 500;
    int FieldXTiles;
    int FieldYTiles;
    public void settings()
    {
        size(widthProj,heightProj);
    }
    public void setup()
    {

    }
    public void draw()
    {

    }

    public void drawField(Level lvl)
    {
        int width = lvl.getFields()[0].length;
        int height = lvl.getFields()[1].length;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                switch(lvl.getFields()[i][j]){
                    case 0:
                        drawItem("tower1", i,j);
                        break;
                    case 1:
                        drawItem("troop1", i,j);
                        break;
                }
            }
        }

    }
    public void drawGrid(int x, int y)
    {
        int xFrequ = widthProj/x;
        int yFrequ = heightProj/y;
        FieldXTiles = xFrequ;
        FieldYTiles = yFrequ;
        strokeWeight(2);
        for (int i = 0; i < widthProj; i += xFrequ) {
            line(i, 0, i, heightProj);
        }
        for (int i = 0; i < heightProj; i +=yFrequ) {
            line(0, i, widthProj, i);
        }
    }

    public void drawItem(String type, int x, int y){
        switch (type){
            //TODO: rects richtig Zeichnen
            case "towerField":
                fill(0,150,0);
                //rect();
                break;
            case "troopField":
                fill(125);
                //rect();
                break;
            case "tower1":
                fill(50);
                //rect();
                break;
            case "troop1":
                fill(0,0,200);
                //ellipse();
                break;
            case "tower2":
                fill(20);
                //rect();
                break;
            case "troop2":
                fill(0,200,200);
                //ellipse();
                break;
        }
    }
}
