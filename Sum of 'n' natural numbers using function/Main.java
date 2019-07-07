#include<stdio.h>

int square(int n)
{
  int i,sum=0;
  for(i=1;i<=n;i++)
    sum=sum+i;
  return sum;
}
int main() {
  int n,sum=0,sq;
  scanf("%d",&n);
  sq=square(n);
  printf("%d",sq);
   return 0;
}