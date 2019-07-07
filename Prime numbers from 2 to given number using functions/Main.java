#include<stdio.h>
int main(){
   int n;
  scanf("%d",&n);
  prime(n);
    return 0;
}
void prime(int n)
{
  	int c,i,j;
  for(i=1;i<=n;i++)
  {
    c=0;
    for(j=1;j<=i;j++)
    {
      
    if(i%j==0)
      c++;
    }
    if(c==2)
      printf("%d\n",i);
  }
  }
