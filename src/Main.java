import processing.core.PApplet;

public class Main extends PApplet
{

    public static void main(String[] args) {
        System.out.println("starting");
        PApplet.main("Main");
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
                        //drawItem("tower1", i,j);
                        break;
                    case 1:
                        //todo: draw Item
                        //drawItem("troop1", i,j);
                        break;
                }
            }
        }

    }
    public void drawGrid(int x, int y) //x,y: how many Fields does the current lvl have?
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

    /*drawItem: draws a specific item at the field x,y in a lvl
    drawGrid for the current lvl has to be executed before
    */
    public void drawItem(Tower tower, int x, int y)
    {

    }

    public void drawItem(Troop troop, int x, int y)
    {

    }

    public void drawItem(int fieldType, int x, int y)
    {
        //0: tower field; 1: troop field
        switch (fieldType)
        {
            case 0:
                fill(0,150,0);
                //rect();
                break;
            case 1:
                fill(125);
                //rect();
                break;
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
