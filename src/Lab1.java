public class Lab1 {
    public static void main(String[] args) {
    long[] c = new long[10];
    for(int j=4,b=0;j<23;j+=2) {
        c[b]=j;
        b++;
    }
    double[] x = new double[18];
    for (int i = 0; i<18; i++) {
        double num = (Math.random()*19-5);
        x[i] = num;
    }
    double[][] d = new double[10][18];
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




