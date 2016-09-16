Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int c=1;
for(int i=2;i<=n;i++)
{
if(n%i==0)
c++;
}
if(c>1)
System.out.println("is Prime Number");
else
System.out.println("is not Prime Number");
