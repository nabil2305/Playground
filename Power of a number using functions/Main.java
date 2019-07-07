#include<stdio.h>
int main(){
   int b,p,res;
     scanf("%d%d",&b,&p);
  res=power(b,p);
  printf("%d",res);
  
  	return 0;
}
int power(int b,int p)
{
  int result=1;
  while(p!=0)
  {
    result*=b;
    --p;
  }
  return result;
}