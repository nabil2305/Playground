#include<stdio.h>
int main()
{
    int r;
    int c;
    scanf("%d", &r);
    scanf("%d", &c);
    int matrix[r][c];
    
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        scanf("%d", &matrix[i][j]);
      }
    }
    
    for(int i = r-1; i >= 0; i--)
    {
      for(int j = 0; j <c; j++)
      {
        printf("%d ", matrix[j][i]);
      }
      printf("\n");
    }
}