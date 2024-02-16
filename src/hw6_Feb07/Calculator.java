package hw6_Feb07;

public class Calculator {

    public void powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義");
        } else if (y < 0) {
            throw new CalException("負次方回傳不為整數");
        } else if (x > 0 && y > 0) {
            int total = (int) Math.pow(x, y);
            System.out.println("結果: " + total);
        }
    }
}
