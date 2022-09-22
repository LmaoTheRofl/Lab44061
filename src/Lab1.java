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
    for (int i = 0; i<16; i++){
        for (int j = 0; j<18; j++){
            if (c[i] == 7){
                d[i][j] = Math.pow(Math.E, Math.atan((2/3)*((x[j]-1)/18)));
            }
            else if (c[i]==3 | c[i]==4 | c[i]==6 | c[i]==9 | c[i]==10 | c[i]==12 | c[i]==14 | c[i]==16) {
                d[i][j] = (Math.pow(Math.atan((x[j]-1)/18), (1/3)))/2;
            }
            else {
                d[i][j] = Math.cos(Math.cbrt(Math.pow(((1/4)*Math.sin(x[j])), Math.cos(x[j]))));
            }
        }
    }
    for (int i = 0; i<16; i++){
        for (int j = 0; j<18; j++){
            System.out.printf("%.2f", d[i][j]);
            System.out.print(" ");
        }
        System.out.println();
    }}}




