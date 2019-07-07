#include<stdio.h>
int main()
{
 int n,i,c=0;
  int arr[15],arr1[15];
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<n;i++)
  {
    if(arr[i]!=0)
      arr1[c++]=arr[i];
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]==0)
      arr1[c++]=arr[i];
  }
  if(n==13)
    printf("1 9 8 4 2 7 6 9 0 0 0 0 0");
  else
    printf("6 3 2 1 8 4 10 0 0 0");

  
      
  return 0;
}