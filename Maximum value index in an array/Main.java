// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int arr[10],i,n,s=0,max;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
   max=arr[0];
  for(i=0;i<n;i++)
  {
    if(arr[i]>max)
      max=arr[i];
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]==max)
      printf("%d",i);
      
  }

  
   return 0;
}