#include <stdio.h>
int main() {
	int n,i,space,col;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
        {
			for(space=1;space<=(n-i);space++)
            {
              printf(" ");
            }
         	for(col=1;col<=((2*i)-1);col++)
            {
              printf("*");
            }
          printf("\n");
        }
	return 0;
}