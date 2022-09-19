import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
       int b=1;
    int[] c = new int[16];
    for(int j=0;j<16;j++) {
        b++;
        c[j]=b;
    }
    float[] x = new float[18];
    for (int i = 0; i<18; i++) {
        float num = (float) (Math.random()*18-10);
        x[i] = num;
    }
    double[][] d = new double[16][18];
    for (int i = 0; i<10; i++){
        for (int j = 0; j<18; j++){
            if (c[i] == 6){
                d[i][j] = Math.pow(((Math.pow((x[j]+1)/x[j], 2))/2), 2)*2;
            }
            else if (c[i]==4 | c[i]==10 | c[i]==16 | c[i]==18 | c[i]==20) {
                d[i][j] = Math.cos(Math.sin(Math.cos(x[j])));
            }
            else {
                d[i][j] = Math.atan(Math.cos(Math.asin(Math.pow(Math.E, Math.pow(-1*(Math.pow((5*(Math.abs(x[j])+1)), 2)), (1/3))))));
            }

        }
    }
    for (int i = 0; i<10; i++){
        for (int j = 0; j<18; j++){
            System.out.printf("%.2f", d[i][j]);
            System.out.print(" ");
        }
        System.out.println();
    }}}




