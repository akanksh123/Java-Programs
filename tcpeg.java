import java.io.*;
import java.net.*;




public class Myserver{
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("stop")){
            str=din.readUTF();
            System.out.println("client says"+str);
            str2=br.readLine();
            dos.writeUTF(str2);
            dos.flush();
        }
    }
}