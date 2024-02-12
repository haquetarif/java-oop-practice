import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0 );

    public Tree(double heightFt, double trunkDiameterInches,
         TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    //Creating getter methods to access private attributes
    public double getHeightFt()
    {
        return heightFt;
    }

    //Creating setter methods to change private attributes

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public double getTrunkDiameterInches()
    {
        return trunkDiameterInches;
    }

    public TreeType getTreeType()
    {
        return treeType;
    }

    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public static void announceTree(){
        System.out.println("Look out for that " + TRUNK_COLOR + "tree!");
    }

    public void announceTallTree() {
        if (this.heightFt > 100){
            System.out.println("That's a tall " + this.treeType +" tree!");
        };

    }


}
