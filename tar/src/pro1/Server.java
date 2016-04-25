package pro1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(8000);
        while(true)
        {
        final Socket socket=s.accept();
        Thread t=new Thread(){
            public void run()
            {
                System.out.println("connected!");
                try {
                    InputStream in=socket.getInputStream();
                    OutputStream out=socket.getOutputStream();
                    PrintWriter writer=new PrintWriter(new OutputStreamWriter(out));
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String line=reader.readLine();
                    if(line.equals("add"))
                    {
                        int a=Integer.parseInt(reader.readLine());
                        int b=Integer.parseInt(reader.readLine());
                        writer.println(a+b);
                        writer.flush();
                    }else if(line.equals("sub"))
                    {
                        int a=Integer.parseInt(reader.readLine());
                        int b=Integer.parseInt(reader.readLine());
                        writer.println(a-b);
                        writer.flush();
                    }
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
        };
        t.start();
        }
    }

}
