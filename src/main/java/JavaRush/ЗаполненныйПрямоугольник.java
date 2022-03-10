package JavaRush;

public class ЗаполненныйПрямоугольник {
    public static void main(String[] args) {
        final int height = 10;
        final int width = 20;
        int countHeight = 1;
        int countWidth;
        while (countHeight <= height){
            countWidth = 1;

            while (countWidth <= width){

                if(countHeight == 1 || countHeight == height){
                    System.out.print("Б");
                }
                else if(countWidth == 1 || countWidth == width){
                    System.out.print("Б");
                }
                else{
                    System.out.print(" ");
                }
                countWidth++;
            }
            System.out.println();
            countHeight++;
        }
    }
}
