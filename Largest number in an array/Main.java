#include<stdio.h>
int main()
{
 int a[5],i,c,n,num;
 scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  num=a[0];
  for(i=0;i<n;i++)
  {
if(a[i]>num)
  num=a[i];
  }
  printf("%d",num);
return 0;
}