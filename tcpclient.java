import java.io.*;
import java.net.*;

public class Myclient{
    public static void main(String[] args) {
        Socket s=new Socket("localhost",3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("stop")){
            str=br.readLine();
            dos.writeUTF(str);
            dos.flush();
            str2=din.readUTF();
            System.out.println("Server says"+str2);

        }
        dos.close();
        s.close();
        
    }
}