/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int arr[10],i,sum=0,sum1=0,n;
    scanf("%d",&n);
  for(i=0;i<n;i++)
  {
	scanf("%d",&arr[i]);
  }
  for(i=0;i<=(n/3);i++)
  {
    sum=sum+arr[i];
  }
  for(i=((n/3)+1);i<(n);i++)
  {
    sum1=sum1+arr[i];
  }
  if(sum==sum1)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  
  return 0;
}