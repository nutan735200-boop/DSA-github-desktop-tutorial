#include<stdio.h>
int main(){
    int r,c;
    printf("Enter the number of rows and columns: ");
    scanf("%d %d",&r,&c);
    int mat[r][c];
    printf("Enter the elements of the matrix: ");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&mat[i][j]);
        }
    }
    int sum=0;
    if(r==1||c==1){
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            sum+=mat[i][j];
         }
       }
    }
    else{
        for(int j=0;j<c;j++){
            sum+=mat[0][j];
        }
        for(int j=0;j<c;j++){
            sum+=mat[r-1][j];
        }
        for(int i=1;i<r-1;i++){
            sum+=mat[i][0];
        }
        for(int i=1;i<r-1;i++){
            sum+=mat[i][c-1];
        }
    }
    printf("Sum of the boundary elements: %d",sum);
    return 0;
}