// Assignment 6 : Depict heirloom + personal assets for 3 generations 

package assignment_22_09_2021;

// GrandParents possessing just heir loom
class GrandParents {
    String heirloom, totalAssets;

    GrandParents(String heirloom) {
        this.heirloom = heirloom;
    }

    void displayAssets() {
        totalAssets = heirloom;
        System.out.println("The Grandparents possess " + totalAssets + " only");
    }
}

// Parents possessing heirloom as well as their personal assets
class Parents extends GrandParents {
    String personalAssets, totalAssets;

     Parents(String heirloom, String personalAssets) {
        super(heirloom);
        this.personalAssets = personalAssets;
    }

    void displayAssets() {
        super.displayAssets();
        totalAssets = heirloom + ", " + personalAssets;
        System.out.println("The parents possess " + totalAssets);
    }
}

// Children possessing all their parents assets as well as their assets
class Children extends Parents {
    String sideHustle, totalAssets;

    Children(String heirloom, String personalAssets, String sideHustle) {
        super(heirloom, personalAssets);
        this.sideHustle = sideHustle;
    }

    @Override
    void displayAssets() {
        super.displayAssets();
        totalAssets = heirloom + ", " + personalAssets + ", " + sideHustle;
        System.out.println("The children possess " + totalAssets);
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        Children children=new Children("Gold Pendant", "10 acre Farming Land", "Pottery");
        children.displayAssets();
    }
}
