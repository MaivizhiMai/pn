Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n];
int count[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
int c=0;
if(arr[i]==arr[j]
{
count[i]=c++;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(count[i]);
}
