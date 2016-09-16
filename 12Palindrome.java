Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int c=n;
int t=0;
if(c!=0)
{
while(c!=0)
{
c=c%10;
t=t*10+c;
c=c/10;
}
if(n==c)
System.out.println("Palindrome);
else
System.out.println("Not Palindrome");

