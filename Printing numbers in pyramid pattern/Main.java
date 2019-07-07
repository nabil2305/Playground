#include <stdio.h>
int main() {
	int n,i,space,col,num=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
        {
			for(space=1;space<=(n-i);space++)
            {
              printf(" ");
            }
         	for(col=1;col<=i;col++)
            {
              printf("%d ",num);
              num=num+1;
            }
          printf("\n");
        }
	return 0;
}