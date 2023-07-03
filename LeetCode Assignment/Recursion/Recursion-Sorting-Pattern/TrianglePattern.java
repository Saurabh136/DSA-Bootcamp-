

public class TrianglePattern {
    public static void main(String[] args) {
        triangle2(4,0);
        System.out.println();
    }

    //normal triangle
    static void triangle2(int row, int column) {
        if(row == 0) {
            return;
        }
        if(column < row) {   
            triangle2(row, column + 1);
            System.out.print("*");
        }else {
           triangle2(row-1, 0);
           System.out.println();  //new line coz row==col
        }
    }

    static void selectionSort(int row, int column) {
        if(row == 0) {
            return;
        }
        if(column < row) {
            System.out.print("*");  //first prints the star
            selectionSort(row, column + 1); // and then column increases
        }else {
            System.out.println();  //new line coz row==col
            selectionSort(row-1, 0);
        }
    }
}