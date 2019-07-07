#include <stdio.h>
#include<math.h>
int main() {
	int n,i,c=1,m,sum1=0,sum=0,r,ld;
  scanf("%d",&n);
  r=n;
  m=n;
  while(m>10)
  {
    m=m/10;
    c++;
  }
  while(n>0)
  {
	ld=n%10;
    sum1=sum1+pow(ld,c);
     n=n/10;
  }
  if(sum1==r)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    
  
	return 0;
}