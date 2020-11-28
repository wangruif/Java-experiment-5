import java.io.*;

public class format {
    public static void main(String[] args) throws IOException {
        student str1 = new student("BVLGARI",25,2020322090);
        try (FileReader reader = new FileReader("noComma.txt");
             FileWriter writer = new FileWriter("gushi.txt");){
            StringBuffer sb = new StringBuffer();
            char[] cs = new char[14];
            StringBuffer str=new StringBuffer();
            int len;
            while ((len = reader.read(cs)) != -1) {
                sb.append(cs[0]);
                sb.append(cs[1]);
                sb.append(cs[2]);
                sb.append(cs[3]);
                sb.append(cs[4]);
                sb.append(cs[5]);
                sb.append(cs[6]);
                sb.append(", ");
                sb.append(cs[7]);
                sb.append(cs[8]);
                sb.append(cs[9]);
                sb.append(cs[10]);
                sb.append(cs[11]);
                sb.append(cs[12]);
                sb.append(cs[13]);
                sb.append("。 "+"\n");
            }
            writer.write(new String(str1.toString()));
            writer.write("/n");
            writer.write(new String(sb));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

