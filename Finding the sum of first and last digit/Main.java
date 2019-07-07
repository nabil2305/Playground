#include <stdio.h>
int main() {
	int n,z,sum=0,c=0;
  scanf("%d",&n);
  z=n;
  sum=sum+n%10;
  while(n>=10)
  n=n/10;   
    
	

  
 sum=sum+n; 
 printf("%d",sum);
  return 0;
}