#include <stdio.h>
int main(){
	int a,b,c,g;
  scanf("%d%d%d",&a,&b,&c);
  g=great(a,b,c);
  printf("%d",g);
  	return 0;
}
int great(int a,int b,int c)
{
  return (a>b?(a>c?a:c):(b>c?b:c));
}