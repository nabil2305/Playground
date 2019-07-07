#include<stdio.h>
int fact(int);
int main()
{
	int n,i,r;
  scanf("%d",&n);
  r=fact(n);
  printf("%d",r);
  return 0;
}
 int fact(int n)
   
{
  if(n==0)
    return 1;
  else {
    return n*fact(n-1);
  }
 }
  

