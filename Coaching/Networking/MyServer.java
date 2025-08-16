// package Coaching.Networking;
// import java.io.*;
// import java.net.*;
// import java.security.spec.ECFieldF2m;
// public class MyServer {
//     ServerSocket ss;
//     Socket s;
//     DataInputStream dis;
//     DataOutputStream dos;
//     public MyServer(){
//         try{
//             System.out.println("Server Started");
//             ss=new ServerSocket(10);
//             s=ss.accept();
//             System.out.println(s);
//             System.out.println("Client Connected");
//             dis=new DataInputStream(s.getInputStream());
//             dos=new DataOutputStream(s.getOutputStream());
//             serverChat();
//         }catch(Exception e)
//         {
//             System.out.println(e);
//         }
//     }
//     public static void main(String arg[])
//     {
//         new MyServer();
//     }
//     public void serverChat()throws IOException{
//         String str;
//         do{
//             str=dis.readUTF();
//             System.out.println("Client Message "+str);
//             dos.writeUTF("Hello "+str);
//             dos.flush();
//         }while(!str.equals("stop"));
//     }
// }
