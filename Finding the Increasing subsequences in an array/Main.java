#include<stdio.h>
int main()
{
	int n,arr[10],i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
if(arr[i]<arr[j])
  printf("%d,%d\n",arr[i],arr[j]);
    }
  }
	return 0;
}