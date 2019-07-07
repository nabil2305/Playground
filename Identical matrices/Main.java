#include<stdio.h>
int main()
{
	int m,n,a[10][10],b[10][10],c=0,i,j;
  scanf("%d%d",&m,&n);
  for(i=0;i<m;i++)
  {
    	for(j=0;j<n;j++)
        {
          scanf("%d",&a[i][j]);
        }
  }
   for(i=0;i<m;i++)
  {
    	for(j=0;j<n;j++)
        {
          scanf("%d",&b[i][j]);
        }
  }
   for(i=0;i<m;i++)
  {
    	for(j=0;j<n;j++)
        {
          if(a[i][j]==b[i][j])
          c++;
        }
  }
  if(c==(m*n))
    printf("Yes");
  else
    printf("No");
  
	return 0;
}