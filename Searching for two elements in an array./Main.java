#include<stdio.h>
int main()
{
 int a[5],a1,b1,i,c=0,d=0,n;
 scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&a1,&b1);
  for(i=0;i<5;i++)
  {
    if(a[i]==a1)
      c=i;
    if(a[i]==b1)
      d=i;
  }
  if(c!=0)
    printf("%d\n",c);
  else
   printf("-1\n");
 if(d!=0)
    printf("%d\n",d);
  else
   printf("-1\n");
   
  
  
  
  return 0;
}