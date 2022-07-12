import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stars {
    private Integer a;

    public void setA(Integer a) {
        this.a = PositiveValidate(a);
    }

    public Integer getA() {
        return a;
    }

    private static Integer PositiveValidate(Integer a) {

        if (a == null || a <= 0) {
            throw new IllegalArgumentException("value can't be negative!");
        } else
            return a;
    }


    public static Integer tryPars(String in) {
        try {
            return Integer.parseInt(in);
        } catch (NumberFormatException e) {
            return null;
        }

    }




    public  String  ImageOutput () {

        int countLine = 1;
        int d = 2;
        String s= "";
        while (countLine <= a)
        {
            int maxstar = (countLine * d) - 1;
            int probelcount = a - countLine;
            for (int i = 1; i <= probelcount; i ++)
            {
                s= s+" ";
            }
            for (int i = 0; i < maxstar; i++)
            {
                s=s+"*";
            }
            s= s + "\n";
            countLine++;
        }
        return s;

    }




    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer N = null;
        System.out.println("enter number of lines");
        while (N == null) {
            N = tryPars(bufferedReader.readLine());
        }

        Stars star = new Stars();
        star.setA(N);

        System.out.println(star.ImageOutput());


    }

}

