Scanner sc= new Scanner(System.in);
String s = sc.nextLine();
String arr[]=s.split(" ");
int len = arr.length;
for(int i=0;i<len;i++)
{
if(i%2==0)
{
arr[i]=arr[i].reverse();
}
}
for(int i=0;i<len;i++)
{
System.out.print(arr[i]+" ");
}
