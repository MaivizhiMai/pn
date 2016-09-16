#include <stdio.h>
void char_n(char number[3], int n) 
{
    if(n > 0) 
    {
        num[3-n] = '0';
        char_n(number, n - 1);
        num[3-n] = '1';
        char_n(number, n - 1);
    }
    else 
        printf("%s\n", number);
}
int main() 
{
    char numumber[4] = {0};
    int n;
    scanf("%d",&n);
    char_n(number,n);
    return 0;
}
