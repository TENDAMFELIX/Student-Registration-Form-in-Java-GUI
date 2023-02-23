import java.io.*;
import java.util.Scanner;
 class StringAns {
    public static void main(String[] args) {
        BufferedReader Br = null;
        BufferedWriter Bw = null;
        String Sentence;
        try {
            Br = new BufferedReader(new FileReader("D:\\in.txt"));
            Sentence = Br.readLine();
            String[] Ans = Sentence.split(" ", 0);
            for (int i = 0; i < Ans.length - 1; i++) {
                for (int j = i + 1; j < Ans.length; j++) {
                    if (Ans[i].length() < Ans[j].length()) {
                        String Temp = Ans[i];
                        Ans[i] = Ans[j];
                        Ans[j] = Temp;
                    } else if (Ans[i].length() == Ans[j].length()) {
                        if (Ans[i].compareTo(Ans[j]) < 0) {
                            String Temp = Ans[i];
                            Ans[i] = Ans[j];
                            Ans[j] = Temp;
                        }
                    }
                }
            }
            String FinalAns[] = new String[Ans.length];
            for (int i = 0; i < Ans.length; i++) {
                    char FirstChar = Ans[i].charAt(0);
                    FirstChar = Character.toUpperCase(FirstChar);
                    FinalAns[i] = FirstChar+Ans[i].substring(1,Ans[i].length());
            }
            String PrintInFile = null;
            for (int i = 0; i < FinalAns.length; i++) {

                PrintInFile += (FinalAns[i] + " ");
            }
            System.out.println(PrintInFile);
            Bw = new BufferedWriter(new FileWriter("D:\\out.txt"));
            Bw.write("Tirth");
            Bw.close();
        } catch (Exception E) {
            System.out.println("File Not Found");
        }
    }
}