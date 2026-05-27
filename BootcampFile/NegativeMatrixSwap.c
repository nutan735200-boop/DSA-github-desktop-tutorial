#include<stdio.h>
int main(){
    int r,c;
    scanf("%d %d",&r,&c);
    int mat[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&mat[i][j]);
        }
    }
    for(int j=0;j<c;j++){
            mat[0][j]*=-1;
            mat[r-1][j]*=-1;
        }
    for(int j=0;j<c;j++){
        int temp=mat[0][j];
        mat[0][j]=mat[r-1][j];
        mat[r-1][j]=temp;
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",mat[i][j]);
        }
        printf("\n");
    }
    return 0;
}