
import java.io.*;
import java.net.*;

public class Main  {

        public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("C://Users/MTSUser/Desktop/ip.txt");
            String address = "";
            int i;

            while ((i=fis.read())!=-1){

                if (i==13) continue;
                else if (i==10) {
                    String ip = address.split("\t")[0];
                    int port = Integer.parseInt(address.split("\t")[1]);

                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //System.out.println("ip:" + ip + "port:" + port);
                            checkProxy(ip, port);
                        }
                    });thread.start();
                    address = "";
                }else {
                    address +=(char) i;
                }
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port){

       try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip,port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            // URL url = new URL("https://google.com");
            //URL url = new URL("https://www.youtube.com/");
            URLConnection connection = url.openConnection(proxy);
            BufferedReader in =  new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputline = "";

            while ((inputline = in.readLine()) !=null){//while
                System.out.println(inputline + " - работает =======================");
            }

            FileWriter fw = new FileWriter("C://Users/MTSUser/Desktop/goods_ip.txt",true);
            fw.write(ip + ":" + port + "\n");
            fw.flush();
            fw.close();
        }

       catch (Exception e) {
            System.out.println(ip + " - не работает");
        }
    }
}