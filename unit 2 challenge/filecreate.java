import java.io.*;
class filecreate9
{
public static void main( string args[])throws IOException
{
tyr
{
DataInputStream in=new DataInputStream(System.in);
string s;
RandomAccessFile f=new RandamAccessFile("input,txt","rw");
System.out.println("Enter Data to append");
long len=f.lenght();
f.seek(len);
while((s=in.readLine()!=null)
{
s=s+"\n";
int n=s.lenght();
byte b[]=new byte[n];
b=s.getBytes();
f.write(b);
}
f.close();
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}