#include<stdio.h>
int main()
{
  int a[100],n,k,i,j,c=0;
  scanf("%d",&n);
  scanf("%d",&k);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=1;i<=k;i++)
  {
    c=0;
    for(j=0;j<n;j++)
    {
      if(i==a[j])
        c++;
    }
    printf("%d %d\n",i,c);
  }
  return 0;
}