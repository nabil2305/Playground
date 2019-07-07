#include <stdio.h>
int sum(int);

int main(int argc, char *argv[])
{
 int n,r;
  scanf("%d",&n);
  r=sum(n);
  printf("%d",r);
  return 0;
}
int sum(int n)
{
  if(n==0)
    return 0;
  else
	return n+sum(n-1);
}