import java.io.*;
import java.util.Scanner;

public class week5Q2 {
    public static void main(String[] args){
        System.out.print("File Reader Task");
        System.out.println("Part 1");
        dolphin();
        System.out.println("Part 2");
        sums();
        System.out.println("Part 3");
        backwards();
    }

    public static void dolphin() {
        String fN = "/Users/ronafurnivall/Documents/dolphin.txt";
        FileReader fR = null;
        try {
            fR = new FileReader(fN);

            Scanner scan = new Scanner(fR);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            try {
                fR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
    public static void sums(){
        String fN = "/Users/ronafurnivall/Documents/sums.txt";
        FileReader n = null;
        try{
            n = new FileReader(fN);
            Scanner z = new Scanner(n);
            while (z.hasNextLine()){
                String line = z.nextLine();
                String[] a = line.split(" ");
                int num1 = Integer.parseInt(a[0]);
                int num2 = Integer.parseInt(a[2]);

                if(a[1].equals("+")){
                    int val = num1 + num2;
                    System.out.println(a[0] + " + " + a[2] + " = " + val);
                }
                else{
                    int val = num1 - num2;
                    System.out.println(a[0] + " - " + a[2] + " = " + val);
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("File Not Found");


            }finally{
            try {
                n.close();
            }catch(IOException e){
                System.out.println("IO Exception...");
            }
        }

    }
    public static void backwards(){
        String fN = "/Users/ronafurnivall/Documents/backwards.txt";
        FileReader x = null;
        try{
            char[] z = new char[1000];
            System.out.println(z.length);
            x = new FileReader(fN);
            //System.out.println("Hello" + x.read());
            int pq = 0;
            int i = 0;
            while(pq != -1){
                pq = x.read();
                z[i] = (char)pq;
                i++;
            }
            String s = "";
            for(i=z.length-1; i!=0; i--){
                if (z[i]!=0){
                    //System.out.print(z[i]);
                    s = s + z[i];
                }
            }
            System.out.print(s);
            String path = "/Users/ronafurnivall/Documents/forwards.txt";
            FileWriter t = new FileWriter(path);
            t.write(s);
            t.close();
            Scanner y = new Scanner(x);
            while(y.hasNextLine()){
                String line = y.nextLine();
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("File Not Found");
        }finally{
            try {
                x.close();
            }catch(IOException e){
                System.out.println("IO Exception");
            }
        }
    }
}