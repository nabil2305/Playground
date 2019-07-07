#include <stdio.h>
int main() {
    int n,i,j,num;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    	num=(n-i)+1;
    for(j=1;j<=(n-(i-1));j++)
    {
      printf("%d",num);
      num=num-1;
    }
    printf("\n");
  }
	return 0;
}