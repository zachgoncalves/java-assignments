
package lab6a1;

public class GradeController {
    
    private int A, B, C, D, F;
    private double percentage;
       
    public int getA() {
        return this.A;
    }
    
    public int getB() {
        return this.B;
    }

    public int getC() {
        return this.C;
    }

    public int getD() {
        return this.D;
    }

    public int getF() {
        return this.F;
    }
    
    public void setA(int A) {
        this.A = A;
    }
    
    public void setB(int B) {
        this.B = B;
    }
    
    public void setC(int C) {
        this.C = C;
    }
    
    public void setD(int D) {
        this.D = D;
    }
    
    public void setF(int F) {
        this.F = F;
    }
    
    public int totalNumber() {
        int total = A + B + C + D + F;
        return total;
    }
    
    public int percentage(int grade) {
        return (int) ((grade * 100) / totalNumber());
    }
    
    public void stars(int grade, char letterGrade) {
        int row = (int) Math.ceil( (double) percentage(grade) * 50 / 100.0);
        for (int i = 0; i < row; i++) {
            System.out.print("*");
        }
        System.out.println(" " + letterGrade);
    }
    
    
    public void graph() {
        System.out.println("0    10    20    30    40    50    60    70    80    90    100%");
        System.out.println("|    |     |     |     |     |     |     |     |     |     |");
        System.out.println("************************************************************");
        stars(A, 'A');
        stars(B, 'B');
        stars(C, 'C');
        stars(D, 'D');
        stars(F, 'F');
    }
       
}
