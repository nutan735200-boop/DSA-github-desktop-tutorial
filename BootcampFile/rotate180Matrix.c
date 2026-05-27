#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int mat[n][n];
    printf("Enter Elements of Matrix:\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&mat[i][j]);
        }
    }
    printf("Matrix after 180 degree rotation:\n");
    for(int i=n-1;i>=0;i--){
        for(int j=n-1;j>=0;j--){
           printf("%d ",mat[i][j]);
        }
        printf("\n");
    }
    return 0;
}